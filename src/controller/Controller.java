
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.Menu;
import model.Usuario;
import view.Cadastro;
import view.Login;

/**
 *
 * @author Julian Ryu Takeda
 */
public class Controller {   
    ArrayList<Usuario> lista = new ArrayList(); //ArrayList é criado aqui
    private Menu menu;
    private Cadastro cadastro;
    private Login login;
    
    public Controller(Login login){
        
    }
    
    public ArrayList<Usuario> getLista() {
        return lista;
    }

    public Controller(Menu menu) {
        this.menu = menu;
    }
    
    public Controller(Cadastro cadastro){
        this.cadastro = cadastro;
    }
    
    public void Cadastrar(){
        String nome = cadastro.getTxtNome().getText();
        String cpf = cadastro.getTxtCpf().getText();
        String senha = cadastro.getTxtSenha().getText();
        lista.add(new Usuario(nome,cpf,senha));
        System.out.println(lista);
    }
    
    public void login(){
        Login l = new Login();
        l.setVisible(true);
    }
    
    public void verificarEscolha(){
        if(menu.getjSaldo().isSelected()){
            String senha = JOptionPane.showInputDialog("Digite a sua senha: ");
            String senha1 = "teste1";
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
            
        }else if(menu.getjSair().isSelected()){
      
        }else{
            String frase = "Escolha uma opcao";
            menu.getLblNaoEscolhido().setText(frase);
        }
    }
        
}
