
package controller;

import DAO.BancoDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Bitcoin;
import model.Carteira;
import model.Ethereum;
import model.Investidor;
import model.Moeda;
import view.Menu;
import model.Pessoa;
import model.Real;
import model.Ripple;
import view.Login;
import view.SaldoAtual;
import view.ComprarCriptoptomoedas;

/**
 *
 * @author Julian Ryu Takeda
 */
public class Controller {
    private Menu menu;
    private Pessoa pessoa;
    private Investidor investidor;

    public Controller(Menu menu, Pessoa pessoa) {
        this.menu = menu;
        this.pessoa = pessoa;
    }

    public void verificarEscolha() {
        if (menu.getjSaldo().isSelected()) {
            exibirSaldo();
        } else if (menu.getjExtrato().isSelected()) {
            exibirExtrato();
        } else if (menu.getjDepositar().isSelected()) {
            realizarDeposito();
        } else if (menu.getjSacar().isSelected()) {
            realizarSaque();
        } else if (menu.getjComprar().isSelected()) {
            realizarCompra();
        } else if (menu.getjVender().isSelected()) {
            realizarVenda();
        } else if (menu.getjAtualizar().isSelected()) {
            atualizarDados();
        } else if (menu.getjExcluir().isSelected()) {
            excluirPessoa();
        } else if (menu.getjSair().isSelected()) {
            sair();
        } else {
            JOptionPane.showMessageDialog(menu, "Escolha uma opção");
        }
    }

    private void exibirSaldo() {
        String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
        String senha = JOptionPane.showInputDialog("Digite a sua senha: ");

        Pessoa pessoa = new Pessoa(null, cpf, senha);
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            ResultSet res = dao.consultar(pessoa);
            
            if(res.next()){
            JOptionPane.showMessageDialog(menu,"Acesso liberado");
            String nome = res.getString("nome");
            double real = res.getDouble("real");
            double bitcoin = res.getDouble("bitcoin");
            double ethereum = res.getDouble("ethereum");
            double ripple = res.getDouble("ripple");
            
            Real real1 = new Real(null, real, null);
            Bitcoin bitcoin1 = new Bitcoin(null, bitcoin, null);
            Ethereum ethereum1 = new Ethereum(null, ethereum, null);
            Ripple ripple1 = new Ripple(null, ripple, null);
            ArrayList<Moeda> moedasCarteira = new ArrayList<Moeda>();
            moedasCarteira.add(real1);
            moedasCarteira.add(bitcoin1);
            moedasCarteira.add(ethereum1);
            moedasCarteira.add(ripple1);

            Carteira carteira = new Carteira(moedasCarteira);

            SaldoAtual viewMoeda = new SaldoAtual(new Investidor(carteira, nome, cpf, senha));
            viewMoeda.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(menu,"Acesso negado");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(menu,"Erro de conexao");
        }
    }

    private void exibirExtrato() {
        // Lógica para exibir extrato
    }

    private void realizarDeposito() {
        if(pessoa == null){
            JOptionPane.showMessageDialog(menu, "Investidor não encontrado");
            return;
        }
        
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            ResultSet res = dao.consultar(pessoa);
            
            if(res.next()){
                double realBanco = res.getDouble("real");
                System.out.println(realBanco);
                String real = JOptionPane.showInputDialog("Digite o valor em real a ser depositado: ");
                double realValor = Double.parseDouble(real);
                double valorAtualizado = realBanco + realValor;
                dao.Deposito(pessoa, valorAtualizado);
                
                JOptionPane.showMessageDialog(menu,"Novo saldo: " + valorAtualizado);
            } else{
                JOptionPane.showMessageDialog(menu, "Investidor não encontrado");
            }             
       }catch(SQLException e){
           JOptionPane.showMessageDialog(menu, "Falha de conexao!");
       } 
    }

    private void realizarSaque() {
        if(pessoa == null){
            JOptionPane.showMessageDialog(menu, "Investidor não encontrado");
            return;
        }
        
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            ResultSet res = dao.consultar(pessoa);
            
            if(res.next()){
                double realBanco = res.getDouble("real");
                System.out.println(realBanco);
                String real = JOptionPane.showInputDialog("Digite o valor em real a ser sacado: ");
                double realValor = Double.parseDouble(real);
                double valorAtualizado = realBanco - realValor;
                if(valorAtualizado < 0){
                   JOptionPane.showMessageDialog(menu, "Saldo insuficiente para ser sacado"); 
                }else{
                   dao.Saque(pessoa, valorAtualizado);
                   JOptionPane.showMessageDialog(menu,"Novo saldo: " + valorAtualizado); 
                }
            } else{
                JOptionPane.showMessageDialog(menu, "Investidor não encontrado");
            }             
       }catch(SQLException e){
           JOptionPane.showMessageDialog(menu, "Falha de conexao!");
       } 
    }

    private void realizarCompra() {
        String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
        String senha = JOptionPane.showInputDialog("Digite a sua senha: ");

        Pessoa pessoa = new Pessoa(null, cpf, senha);
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            ResultSet res = dao.consultar(pessoa);
            
            if(res.next()){
            JOptionPane.showMessageDialog(menu,"Acesso liberado");
            String nome = res.getString("nome");
            ComprarCriptoptomoedas comprar = new ComprarCriptoptomoedas(new Investidor(nome, cpf, senha));
            comprar.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(menu,"Acesso negado");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(menu,"Erro de conexao");
        }
    }

    private void realizarVenda() {
        // Lógica para realizar venda
    }

    private void atualizarDados() {
        // Lógica para atualizar dados
    }

    private void excluirPessoa() {
        String senha = JOptionPane.showInputDialog("Digite a sua senha: ");
        String senhaAtual = pessoa.getSenha();

        if (senha.length() > 6) {
            menu.getLblNaoEscolhido().setText("A senha tem no máximo 6 caracteres");
        } else {
            if (senha.equals(senhaAtual)) {
                int option = JOptionPane.showConfirmDialog(menu, "Deseja realmente excluir " + pessoa.getNome() + "?");
                if (option == JOptionPane.YES_OPTION) {
                    try (Connection conn = new Conexao().getConnection()) {
                        BancoDAO dao = new BancoDAO(conn);
                        dao.remover(pessoa);
                        JOptionPane.showMessageDialog(menu, "Excluído com sucesso!");
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(menu, "Falha ao conectar ao banco de dados!");
                    }
                }
            } else {
                menu.getLblNaoEscolhido().setText("Senha incorreta");
            }
        }
    }

    private void sair() {
        // Lógica para sair do sistema
    }
}
