
package controller;

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
    
    public Controller(Login login){
        
    }

    public Controller(Menu menu) {
        this.menu = menu;
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
