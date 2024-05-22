package controller;

import DAO.BancoDAO;
import DAO.Conexao;
import model.Pessoa;
import view.Cadastro;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import view.Login;

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
            ResultSet resultado = dao.consultarUsuarioExistente(cpf);
            
            if(resultado.next()) {
                JOptionPane.showMessageDialog(view, "Usuario ja existe");
            } else {
                dao.inserir(pessoa);
                JOptionPane.showMessageDialog(view, "Usuario cadastrado");
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(view, "Erro ao cadastrar usuario: " + e.getMessage());
        }     
    }
   
    public void abrirLogin(){
        Login l = new Login();
        l.setVisible(true);
        view.setVisible(false);
    }
}
