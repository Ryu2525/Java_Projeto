
package DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Pessoa;
import java.sql.PreparedStatement;
/**
 *
 * @author Julian Ryu Takeda
 */
public class BancoDAO {
    private Connection conn;

    public BancoDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Pessoa pessoa) throws SQLException{
        String sql = "select * from bancomoedas where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, pessoa.getCpf());
        statement.setString(2, pessoa.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void inserir(Pessoa pessoa) throws SQLException{
        String sql = "INSERT INTO bancomoedas(nome, cpf, senha) values(?,?,?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, pessoa.getNome());
            statement.setString(2, pessoa.getCpf());
            statement.setString(3, pessoa.getSenha());
            statement.execute(); 
        } 
        conn.close();
    }
    
}
