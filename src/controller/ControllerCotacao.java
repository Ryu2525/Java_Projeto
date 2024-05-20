
package controller;

import DAO.BancoDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Investidor;
import view.Cotacao;

/**
 *
 * @author ryuta
 */
public class ControllerCotacao {
    private Cotacao cotacao;
    private Investidor investidor;
    private double numeroCotacao;

    public ControllerCotacao(Cotacao cotacao, Investidor investidor, double numeroCotacao) {
        this.cotacao = cotacao;
        this.investidor = investidor;
        this.numeroCotacao = numeroCotacao;
    }
    
    public void valoresCotacoa(){
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            String bit = "Bitcoin";
            String eth = "Ethereum";
            String rip = "Ripple";
            ResultSet res1 = dao.consultarMoeda(bit);
            ResultSet res2 = dao.consultarMoeda(eth);
            ResultSet res3 = dao.consultarMoeda(rip);
            
            if(res1.next() && res2.next() && res3.next()){
                double bitcoin = res1.getDouble("valor");
                double ethereum = res2.getDouble("valor");
                double ripple = res3.getDouble("valor");
                
                double bitCota = bitcoin * numeroCotacao;
                double ethCota = ethereum * numeroCotacao;
                double ripCota = ripple * numeroCotacao;
                
                double newBitcoin = bitcoin + bitCota;
                double newEthereum = ethereum + ethCota;
                double newRipple = ripple + ripCota;
                
                dao.CotacaoAtualizar("Bitcoin", newBitcoin);
                dao.CotacaoAtualizar("Ethereum", newEthereum);
                dao.CotacaoAtualizar("Ripple", newRipple);
                
                String newBitcoinStr = String.valueOf(newBitcoin);
                String newEthereumStr = String.valueOf(newEthereum);
                String newRippleStr = String.valueOf(newRipple);
                cotacao.getLblValorBitcoin().setText(newBitcoinStr);
                cotacao.getLblValorEthereum().setText(newEthereumStr);
                cotacao.getLblValorRipple().setText(newRippleStr);
                
                System.out.println(numeroCotacao);
                System.out.println("Moedas atualizadas");
            }else{
                System.out.println("As moedas nao foram pegas");
            }
        }catch(SQLException e){
            System.out.println("Erro de conexao");
            e.printStackTrace();
        }
    }
    
}
