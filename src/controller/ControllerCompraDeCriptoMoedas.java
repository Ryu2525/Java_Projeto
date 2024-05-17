
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
import model.Ethereum;
import model.Ripple;

/**
 *
 * @author ryuta
 */
public class ControllerCompraDeCriptoMoedas {
    private ComprarCriptoptomoedas comprar;
    private Pessoa pessoa;
    private Investidor investidor;

    public ControllerCompraDeCriptoMoedas(ComprarCriptoptomoedas comprar, Investidor investidor, Pessoa pessoa) {
        this.comprar = comprar;
        this.investidor = investidor;
        this.pessoa = pessoa;
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
    
//    private void ValorMoedas(){
//        Conexao conexao = new Conexao();
//        
//        try{
//            Connection conn = conexao.getConnection();
//            BancoDAO dao = new BancoDAO(conn);
//            String bit = "Bitcoin";
//            String eth = "Ethereum";
//            String rip = "Ripple";
//            ResultSet res1 = dao.consultarMoeda(bit);
//            ResultSet res2 = dao.consultarMoeda(eth);
//            ResultSet res3 = dao.consultarMoeda(rip);
//            
//            if(res1.next() && res2.next() && res3.next()){
//                double bitcoin = res1.getDouble("valor");
//                double ethereum = res2.getDouble("valor");
//                double ripple = res3.getDouble("valor");
//                
//                Bitcoin biti = new Bitcoin(null, null, bitcoin);
//                Ethereum ethe = new Ethereum(null, null, ethereum);
//                Ripple ripp = new Ripple(null, null, ripple);
//                
//                // Verificando se os valores foram atribuídos corretamente
//                System.out.println("Bitcoin valor: " + biti.getValorDaMoeda());
//                System.out.println("Ethereum valor: " + ethe.getValorDaMoeda());
//                System.out.println("Ripple valor: " + ripp.getValorDaMoeda());
//
//                System.out.println("Foi pego os valores das moedas");
//            }else{
//                System.out.println("As moedas nao foram pegas");
//            }
//        }catch(SQLException e){
//            System.out.println("Erro de conexao");
//        }
//    }
    
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
            String bit2 = "Bitcoin";
            ResultSet res1 = dao.consultarMoeda(bit2);
            
            if(res.next() && res1.next()){
                double saldoReal = res.getDouble("real");
                double saldoBitcoin = res.getDouble("bitcoin");
                double bitcoinBanco = res1.getDouble("valor");
                
                String bitcoin = JOptionPane.showInputDialog("Digite a quantidade de bitcoins que deseja comprar: ");
                double quantidadeBitcoin = Double.parseDouble(bitcoin);
                
                double bitValor = investidor.getCarteira().getMoeda().get(1).getValorDaMoeda();
                
                Bitcoin bit = new Bitcoin();
                
                double taxa = bit.taxaDeCompra(quantidadeBitcoin, bitcoinBanco);
                
                double valorDaCompra = bitValor * quantidadeBitcoin + taxa;
                
                double compra = saldoReal - valorDaCompra;
                double somaBitcoin = saldoBitcoin + quantidadeBitcoin;
                
                if(valorDaCompra > saldoReal){
                   JOptionPane.showMessageDialog(comprar, "Saldo insuficiente para compra bitcoin"); 
                }else{
                   dao.CompraDeBitcoin(pessoa, compra, somaBitcoin);
                   JOptionPane.showMessageDialog(comprar,"Novo saldo em real: " + compra);
                   JOptionPane.showMessageDialog(comprar,"Novo saldo em bitcoin: " + somaBitcoin);
                }
            } else{
                JOptionPane.showMessageDialog(comprar, "Investidor não encontrado");
            }             
       }catch(SQLException e){
           JOptionPane.showMessageDialog(comprar, "Falha de conexao!");
           e.printStackTrace();
       } 
    }
    
    private void ComprarEthereum(){
        if(pessoa == null){
            JOptionPane.showMessageDialog(comprar, "Investidor não encontrado");
            return;
        }
        
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            ResultSet res = dao.consultar(pessoa);
            String eth2 = "Ethereum";
            ResultSet res1 = dao.consultarMoeda(eth2);
            
            if(res.next() && res1.next()){
                double saldoReal = res.getDouble("real");
                double saldoEthereum = res.getDouble("ethereum");
                double bitcoinBanco = res1.getDouble("valor");
                
                String ethereum = JOptionPane.showInputDialog("Digite a quantidade de ethereum que deseja comprar: ");
                double quantidadeEthereum = Double.parseDouble(ethereum);
                
                double ethValor = investidor.getCarteira().getMoeda().get(2).getValorDaMoeda();
                
                Ethereum eth = new Ethereum();
                
                double taxa = eth.taxaDeCompra(quantidadeEthereum, bitcoinBanco);
                
                double valorDaCompra = ethValor * quantidadeEthereum + taxa;
                
                double compra = saldoReal - valorDaCompra;
                double somaEthereum = saldoEthereum + quantidadeEthereum;
                
                if(valorDaCompra > saldoReal){
                   JOptionPane.showMessageDialog(comprar, "Saldo insuficiente para compra ethereum"); 
                }else{
                   dao.CompraDeEthereum(pessoa, compra, somaEthereum);
                   JOptionPane.showMessageDialog(comprar,"Novo saldo em real: " + compra);
                   JOptionPane.showMessageDialog(comprar,"Novo saldo em ethereum: " + somaEthereum);
                }
            } else{
                JOptionPane.showMessageDialog(comprar, "Investidor não encontrado");
            }             
       }catch(SQLException e){
           JOptionPane.showMessageDialog(comprar, "Falha de conexao!");
           e.printStackTrace();
       } 
    }
    
    private void ComprarRipple(){
        if(pessoa == null){
            JOptionPane.showMessageDialog(comprar, "Investidor não encontrado");
            return;
        }
        
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            BancoDAO dao = new BancoDAO(conn);
            ResultSet res = dao.consultar(pessoa);
            String rip2 = "Ripple";
            ResultSet res1 = dao.consultarMoeda(rip2);
            
            if(res.next() && res1.next()){
                double saldoReal = res.getDouble("real");
                double saldoRipple = res.getDouble("ripple");
                double rippleBanco = res1.getDouble("valor");
                
                String ripple = JOptionPane.showInputDialog("Digite a quantidade de ripple que deseja comprar: ");
                double quantidadeRipple = Double.parseDouble(ripple);
                
                double ripValor = investidor.getCarteira().getMoeda().get(3).getValorDaMoeda();
                
                Ripple rip = new Ripple();
                
                double taxa = rip.taxaDeCompra(quantidadeRipple, rippleBanco);
                
                double valorDaCompra = ripValor * quantidadeRipple + taxa;
                
                double compra = saldoReal - valorDaCompra;
                double somaRipple = saldoRipple + quantidadeRipple;
                
                if(valorDaCompra > saldoReal){
                   JOptionPane.showMessageDialog(comprar, "Saldo insuficiente para compra ripple"); 
                }else{
                   dao.CompraDeRipple(pessoa, compra, somaRipple);
                   JOptionPane.showMessageDialog(comprar,"Novo saldo em real: " + compra);
                   JOptionPane.showMessageDialog(comprar,"Novo saldo em ripple: " + somaRipple);
                }
            } else{
                JOptionPane.showMessageDialog(comprar, "Investidor não encontrado");
            }             
       }catch(SQLException e){
           JOptionPane.showMessageDialog(comprar, "Falha de conexao!");
           e.printStackTrace();
       } 
    }
}
