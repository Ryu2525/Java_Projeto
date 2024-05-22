
package controller;

import DAO.BancoDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Bitcoin;
import model.Ethereum;
import model.Investidor;
import model.Pessoa;
import model.Ripple;
import view.VenderCriptoMoeda;

/**
 *
 * @author ryuta
 */
public class ControllerVenderCriptoMoedas {
    private VenderCriptoMoeda vender;
    private Pessoa pessoa;
    private Investidor investidor;

    public ControllerVenderCriptoMoedas(VenderCriptoMoeda vender, Investidor investidor, Pessoa pessoa) {
        this.vender = vender;
        this.investidor = investidor;
        this.pessoa = pessoa;
    }
    
    public void verificarEscolha(){
        if (vender.getBtBitcoin().isSelected()) {
            VenderBitcoin();
        } else if (vender.getBtEthereum().isSelected()) {
            VenderEthereum();
        }else if(vender.getBtRipple().isSelected()){
            VenderRipple();
        }
    }
    
    private void VenderBitcoin(){
        if(pessoa == null){
            JOptionPane.showMessageDialog(vender, "Investidor não encontrado");
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
                
                String bitcoin = JOptionPane.showInputDialog("Digite a quantidade de bitcoins que deseja vender: ");
                double quantidadeBitcoin = Double.parseDouble(bitcoin);
                
                double bitValor = investidor.getCarteira().getMoeda().get(1).getValorDaMoeda();
                
                Bitcoin bit = new Bitcoin();
                
                double taxa = bit.taxaDeVenda(quantidadeBitcoin, bitcoinBanco);
                System.out.println(taxa);
                
                double valorDaCompra = bitValor * quantidadeBitcoin - taxa;
                System.out.println(saldoReal);
                System.out.println(valorDaCompra);
                
                double venda = saldoReal + valorDaCompra;
                double subBitcoin = saldoBitcoin - quantidadeBitcoin;
                
                if(quantidadeBitcoin > saldoBitcoin){
                   JOptionPane.showMessageDialog(vender, "Voce nao tem essa quantidade de bitcoins para vender!"); 
                }else{
                   dao.CompraDeBitcoin(pessoa, venda, subBitcoin);
                   dao.Extrato(id, "Venda", quantidadeBitcoin, "Bitcoin", bitcoinBanco, 0.03, venda, subBitcoin, ethereumBanco, rippleBanco);
                   JOptionPane.showMessageDialog(vender,"Novo saldo em real: " + venda);
                   JOptionPane.showMessageDialog(vender,"Novo saldo em bitcoin: " + subBitcoin);
                }
            } else{
                JOptionPane.showMessageDialog(vender, "Investidor não encontrado");
            }             
       }catch(SQLException e){
           JOptionPane.showMessageDialog(vender, "Falha de conexao!");
           e.printStackTrace();
       } 
    }
    
    private void VenderEthereum(){
        if(pessoa == null){
            JOptionPane.showMessageDialog(vender, "Investidor não encontrado");
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
                
                String ethereum = JOptionPane.showInputDialog("Digite a quantidade de ethereum que deseja vender: ");
                double quantidadeEthereum = Double.parseDouble(ethereum);
                
                double ethValor = investidor.getCarteira().getMoeda().get(2).getValorDaMoeda();
                
                Ethereum eth = new Ethereum();
                
                double taxa = eth.taxaDeVenda(quantidadeEthereum, ethereumBanco);
                
                double valorDaVenda = ethValor * quantidadeEthereum - taxa;
  
                double venda = saldoReal + valorDaVenda;
                double subEthereum = saldoEthereum - quantidadeEthereum;
                
                if(quantidadeEthereum > saldoEthereum){
                   JOptionPane.showMessageDialog(vender, "Voce nao tem essa quantidade de ethereum para vender!"); 
                }else{
                   dao.CompraDeEthereum(pessoa, venda, subEthereum);
                   dao.Extrato(id, "Venda", quantidadeEthereum, "Ethereum", ethereumBanco, 0.02, venda, bitcoinBanco, subEthereum, rippleBanco);
                   JOptionPane.showMessageDialog(vender,"Novo saldo em real: " + venda);
                   JOptionPane.showMessageDialog(vender,"Novo saldo em Ethereum: " + subEthereum);
                }
            } else{
                JOptionPane.showMessageDialog(vender, "Investidor não encontrado");
            }             
       }catch(SQLException e){
           JOptionPane.showMessageDialog(vender, "Falha de conexao!");
           e.printStackTrace();
       } 
    }
        
    
    private void VenderRipple(){
         if(pessoa == null){
            JOptionPane.showMessageDialog(vender, "Investidor não encontrado");
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
                
                String ripple = JOptionPane.showInputDialog("Digite a quantidade de ripple que deseja vender: ");
                double quantidadeRipple = Double.parseDouble(ripple);
                
                double ripValor = investidor.getCarteira().getMoeda().get(3).getValorDaMoeda();
                
                Ripple rip = new Ripple();
                
                double taxa = rip.taxaDeVenda(quantidadeRipple, rippleBanco);
                System.out.println(taxa);
                
                double valorDaVenda = ripValor * quantidadeRipple - taxa;
                System.out.println(saldoReal);
                System.out.println(valorDaVenda);
                
                double venda = saldoReal + valorDaVenda;
                double subRipple = saldoRipple - quantidadeRipple;
                
                if(quantidadeRipple > saldoRipple){
                   JOptionPane.showMessageDialog(vender, "Voce nao tem essa quantidade de ripple para vender!"); 
                }else{
                   dao.CompraDeRipple(pessoa, venda, subRipple);
                   dao.Extrato(id, "Venda", quantidadeRipple, "Ripple", rippleBanco, 0.01, venda, bitcoinBanco, ethereumBanco, subRipple);
                   JOptionPane.showMessageDialog(vender,"Novo saldo em real: " + venda);
                   JOptionPane.showMessageDialog(vender,"Novo saldo em ripple: " + subRipple);
                }
            } else{
                JOptionPane.showMessageDialog(vender, "Investidor não encontrado");
            }             
       }catch(SQLException e){
           JOptionPane.showMessageDialog(vender, "Falha de conexao!");
           e.printStackTrace();
       } 
    }
}
