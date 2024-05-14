
package controller;

import DAO.BancoDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Investidor;
import model.Pessoa;
import view.ComprarCriptoptomoedas;
import model.Bitcoin;

/**
 *
 * @author ryuta
 */
public class ControllerCompraDeCriptoMoedas {
    private ComprarCriptoptomoedas comprar;
    private Pessoa pessoa;
    private Investidor investidor;

    public ControllerCompraDeCriptoMoedas(ComprarCriptoptomoedas comprar, Investidor investidor) {
        this.comprar = comprar;
        this.investidor = investidor;
    }
    
    public void verificarEscolha(){
        if (comprar.getBtBitcoin().isSelected()) {
            ComprarBitcoin();
        } else if (comprar.getBtEthereum().isSelected()) {
            ComprarEthereum();
        }else if(comprar.getBtRipple().isSelected()){
            ComprarRipple();
        }
    }
    
    private void ComprarBitcoin(){
        if(pessoa == null){
            JOptionPane.showMessageDialog(comprar, "Investidor não encontrado");
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
                String bitcoin = JOptionPane.showInputDialog("Digite a quantidade de bitcoins que deseja comprar: ");
                double bitcoinValor = Double.parseDouble(bitcoin);
                double bitValor = investidor.getCarteira().getMoeda().get(1).getValorDaMoeda();
                
                double taxa = taxaDeComprar();
                
                if(valorAtualizado < 0){
                   JOptionPane.showMessageDialog(comprar, "Saldo insuficiente para ser sacado"); 
                }else{
                   dao.Saque(pessoa, valorAtualizado);
                   JOptionPane.showMessageDialog(comprar,"Novo saldo: " + valorAtualizado); 
                }
            } else{
                JOptionPane.showMessageDialog(comprar, "Investidor não encontrado");
            }             
       }catch(SQLException e){
           JOptionPane.showMessageDialog(comprar, "Falha de conexao!");
       } 
    }
    
    private void ComprarEthereum(){
        
    }
    
    private void ComprarRipple(){
        
    }
}
