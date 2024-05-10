
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

/**
 *
 * @author Julian Ryu Takeda
 */
public class Controller {   
    private Menu menu;
    private Pessoa pessoa;

    public Controller(Menu menu, Pessoa pessoa) {
        this.menu = menu;
        this.pessoa = pessoa;
    }
  
    public void verificarEscolha(){
        if(menu.getjSaldo().isSelected()){
            String senha = JOptionPane.showInputDialog("Digite a sua senha: ");
            String senha1 = pessoa.getSenha();
            int conferir = senha.length();
            System.out.println(conferir);
            if(conferir > 6){
               menu.getLblNaoEscolhido().setText("A senha tem no maximo 6 caracter"); 
            }else{
                if(senha.equals(senha1)){
                    Pessoa pessoa = new Pessoa(null, menu.getLblCpf().getText(), null);
                    Conexao conexao = new Conexao();
                    
                    try{
                        Connection conn = conexao.getConnection();
                        BancoDAO dao = new BancoDAO(conn);
                        ResultSet res = dao.consultarMoedasPorCPF(pessoa);
                        if(res.next()){
                            JOptionPane.showMessageDialog(menu,"Senha correta");
                            String nome = res.getString("nome");
                            String cpf = res.getString("cpf");
                            double real = res.getDouble("real");
                            double bitcoin = res.getDouble("bitcoin");
                            double ethereum = res.getDouble("ethereum");
                            double ripple = res.getDouble("ripple");
                            Pessoa pessoa1 = new Pessoa(nome, cpf, senha1);
                            Real real1 = new Real(null, real);
                            Bitcoin bitcoin1 = new Bitcoin(null, bitcoin);
                            Ethereum ethereum1 = new Ethereum(null, ethereum);
                            Ripple ripple1 = new Ripple(null, ripple);
                            ArrayList<Moeda> moedasCarteira = new ArrayList<Moeda>();
                            moedasCarteira.add(real1);
                            moedasCarteira.add(bitcoin1);
                            moedasCarteira.add(ethereum1);
                            moedasCarteira.add(ripple1);
                            
                            Carteira carteira = new Carteira(moedasCarteira);
                            
                            SaldoAtual viewMoeda = new SaldoAtual(new Investidor(carteira, nome, cpf, senha1));
                            viewMoeda.setVisible(true);
                            
                        }else{
                            JOptionPane.showMessageDialog(menu,"Login nao foi feito");
                        }
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(menu,"Erro de conexao");
                    }
                }else{
                    menu.getLblNaoEscolhido().setText("senha incorreta");
                }
            }
        }else if(menu.getjExtrato().isSelected()){
            
        }else if(menu.getjDepositar().isSelected()){
            
        }else if(menu.getjSacar().isSelected()){
            
        }else if(menu.getjComprar().isSelected()){
            
        }else if(menu.getjVender().isSelected()){
            
        }else if(menu.getjAtualizar().isSelected()){
            
        }else if(menu.getjExcluir().isSelected()){
            String senha = JOptionPane.showInputDialog("Digite a sua senha: ");
            String senha1 = pessoa.getSenha();
            int conferir = senha.length();
            System.out.println(conferir);
            if(conferir > 6){
               menu.getLblNaoEscolhido().setText("A senha tem no maximo 6 caracter"); 
            }else{
                if(senha.equals(senha1)){
                    String nome = pessoa.getNome();
                    int option = JOptionPane.showConfirmDialog(menu, "Deseja realmente excluir " + nome + "?");
                    if(option != 1){
                    Conexao conexao = new Conexao();
                    try{
                        Connection conn = conexao.getConnection();
                        BancoDAO dao = new BancoDAO(conn);
                        dao.remover(pessoa);
                        JOptionPane.showMessageDialog(menu,"Excluido com sucesso!");
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(menu,"Falha de conexao!");
                    }
                }
                }else{
                    menu.getLblNaoEscolhido().setText("senha incorreta");
                }
            }
        }else if(menu.getjSair().isSelected()){
      
        }else{
            JOptionPane.showMessageDialog(menu,"Escolha uma opção");
        }
    }
        
}
