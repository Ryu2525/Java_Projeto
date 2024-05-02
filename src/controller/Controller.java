
package controller;

import DAO.BancoDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.Menu;
import model.Pessoa;
import view.Login;

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
                    menu.getLblNaoEscolhido().setText("a senha deu certo");
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
                    String cpf = pessoa.getCpf();
                    int option = JOptionPane.showConfirmDialog(menu, "Deseja realmente excluir " + cpf + "?");
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
