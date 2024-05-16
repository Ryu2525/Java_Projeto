
package DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Pessoa;
import java.sql.PreparedStatement;
import model.Investidor;
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
        String sql = "select * from usuario where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, pessoa.getCpf());
        statement.setString(2, pessoa.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void inserir(Pessoa pessoa) throws SQLException{
        String sql = "INSERT INTO usuario(nome, cpf, senha, real, bitcoin, ethereum, ripple) values(?,?,?,?,?,?,?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, pessoa.getNome());
            statement.setString(2, pessoa.getCpf());
            statement.setString(3, pessoa.getSenha());
            statement.setDouble(4, 0);
            statement.setDouble(5, 0);
            statement.setDouble(6, 0);
            statement.setDouble(7, 0);
            statement.execute(); 
        } 
        conn.close();
    }
    
    public void remover(Pessoa pessoa) throws SQLException{
        String sql = "delete from usuario where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, pessoa.getCpf());
        statement.execute();
        conn.close();
    }
    
    public void Deposito(Pessoa pessoa, double valor) throws SQLException{
        String sql = "update usuario set real = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, valor);
        statement.setString(2, pessoa.getCpf());
        statement.execute();
        conn.close();
    }
    
        public void Saque(Pessoa pessoa, double valor) throws SQLException{
        String sql = "update usuario set real = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, valor);
        statement.setString(2, pessoa.getCpf());
        statement.execute();
        conn.close();
    }
        public void CompraDeBitcoin(Pessoa pessoa, double valorReal, double valorBitcoin) throws SQLException{
            String sql = "update usuario set real = ?, bitcoin = ? where cpf = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, valorReal);
            statement.setDouble(2, valorBitcoin);
            statement.setString(3, pessoa.getCpf());
            statement.execute();
            conn.close();
        }
        
        public void CompraDeEthereum(Pessoa pessoa, double valorReal, double valorEthereum) throws SQLException{
            String sql = "update usuario set real = ?, ethereum = ? where cpf = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, valorReal);
            statement.setDouble(2, valorEthereum);
            statement.setString(3, pessoa.getCpf());
            statement.execute();
            conn.close();
        }
        
        public void CompraDeRipple(Pessoa pessoa, double valorReal, double valorRipple) throws SQLException{
            String sql = "update usuario set real = ?, ripple = ? where cpf = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, valorReal);
            statement.setDouble(2, valorRipple);
            statement.setString(3, pessoa.getCpf());
            statement.execute();
            conn.close();
        }
        
    public ResultSet consultarMoeda(String moeda) throws SQLException{
        String sql = "select * from tabelamoedas where moeda = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, moeda);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void CotacaoAtualizar(String moeda, double valor) throws SQLException{
        String sql = "update tabelamoedas set valor = ? where moeda = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, valor);
        statement.setString(2, moeda);
        statement.executeUpdate();
    }
}
