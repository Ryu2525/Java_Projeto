
package controller;

import DAO.BancoDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Pessoa;
import view.Cadastro;
import view.Login;
import view.Menu;

/**
 *
 * @author Julian Ryu Takeda
 */
public class ControllerLogin {
    private Login view;

    public ControllerLogin(Login view) {
        this.view = view;
    }
    
    public void LoginAluno(){
        Pessoa pessoa = new Pessoa(null, view.getTxtCpfLogin().getText(), view.getTxtSenha().getText());
        
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            ResultSet res = dao.consultar(pessoa);
            if(res.next()){
                JOptionPane.showMessageDialog(view,"Login feito");
                String nome = res.getString("nome");
                String cpf = res.getString("cpf");
                String senha = res.getString("senha");
                Menu viewMenu = new Menu(new Pessoa(nome, cpf, senha));
                viewMenu.setVisible(true);
                view.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(view,"Login nao foi feito");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view,"Erro de conexao");
        }
    }
    
    public void AbrirCadastro(){
        Cadastro c = new Cadastro();
        c.setVisible(true);
        view.setVisible(false);
    }
}
