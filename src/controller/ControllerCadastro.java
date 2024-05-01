
package controller;

import DAO.BancoDAO;
import DAO.Conexao;
import model.Pessoa;
import view.Cadastro;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Julian Ryu Takeda
 */
public class ControllerCadastro {
    private Cadastro view; 

    public ControllerCadastro(Cadastro view) {
        this.view = view;
    }
   
   public void salvarAluno(){
       String nome = view.getTxtNome().getText();
       String cpf = view.getTxtCpf().getText();
       String senha = view.getTxtSenha().getText();
       
       Pessoa pessoa = new Pessoa(nome, cpf, senha);
       Conexao conexao = new Conexao();
               
       try{
           Connection conn = conexao.getConnection();
           BancoDAO dao = new BancoDAO(conn);
           dao.inserir(pessoa);
           JOptionPane.showMessageDialog(view, "Usuario cadastrado");
       }catch(SQLException e){
           JOptionPane.showMessageDialog(view, "Usuario nao cadastrado");
       }     
   }
}
