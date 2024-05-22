
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
                double ethereumBanco = res.getDouble("ethereum");
                double rippleBanco = res.getDouble("ripple");
                int id = res.getInt("id_usuario");
                
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
                   dao.Extrato(id, "Compra", quantidadeBitcoin, "Bitcoin", bitcoinBanco, 0.02, compra, somaBitcoin, ethereumBanco, rippleBanco);
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
                double rippleBanco = res.getDouble("ripple");
                double ethereumBanco = res1.getDouble("valor");
                double bitcoinBanco = res.getDouble("bitcoin");
                int id = res.getInt("id_usuario");
                
                String ethereum = JOptionPane.showInputDialog("Digite a quantidade de ethereum que deseja comprar: ");
                double quantidadeEthereum = Double.parseDouble(ethereum);
                
                double ethValor = investidor.getCarteira().getMoeda().get(2).getValorDaMoeda();
                
                Ethereum eth = new Ethereum();
                
                double taxa = eth.taxaDeCompra(quantidadeEthereum, ethereumBanco);
                
                double valorDaCompra = ethValor * quantidadeEthereum + taxa;
                
                double compra = saldoReal - valorDaCompra;
                double somaEthereum = saldoEthereum + quantidadeEthereum;
                
                if(valorDaCompra > saldoReal){
                   JOptionPane.showMessageDialog(comprar, "Saldo insuficiente para compra ethereum"); 
                }else{
                   dao.CompraDeEthereum(pessoa, compra, somaEthereum);
                   dao.Extrato(id, "Compra", quantidadeEthereum, "Ethereum", ethereumBanco, 0.01, compra, bitcoinBanco, somaEthereum, rippleBanco);
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
                double rippleBanco = res1.getDouble("valor");
                double saldoRipple = res.getDouble("ripple");
                double bitcoinBanco = res.getDouble("bitcoin");
                double ethereumBanco = res.getDouble("ethereum");
                int id = res.getInt("id_usuario");
                
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
                   dao.Extrato(id, "Compra", quantidadeRipple, "Ripple", rippleBanco, 0.01, compra, bitcoinBanco, ethereumBanco, somaRipple);
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
