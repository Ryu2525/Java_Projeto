
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
            
            if(res.next()){
                double saldoReal = res.getDouble("real");
                double saldoBitcoin = res.getDouble("bitcoin");
                
                String bitcoin = JOptionPane.showInputDialog("Digite a quantidade de bitcoins que deseja vender: ");
                double quantidadeBitcoin = Double.parseDouble(bitcoin);
                
                double bitValor = investidor.getCarteira().getMoeda().get(1).getValorDaMoeda();
                
                Bitcoin bit = new Bitcoin();
                
                double taxa = bit.taxaDeVenda(quantidadeBitcoin);
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
            
            if(res.next()){
                double saldoReal = res.getDouble("real");
                double saldoEthereum = res.getDouble("ethereum");
                
                String ethereum = JOptionPane.showInputDialog("Digite a quantidade de ethereum que deseja vender: ");
                double quantidadeEthereum = Double.parseDouble(ethereum);
                
                double ethValor = investidor.getCarteira().getMoeda().get(2).getValorDaMoeda();
                
                Ethereum eth = new Ethereum();
                
                double taxa = eth.taxaDeVenda(quantidadeEthereum);
                System.out.println(taxa);
                
                double valorDaVenda = ethValor * quantidadeEthereum - taxa;
                System.out.println(saldoReal);
                System.out.println(valorDaVenda);
                
                double venda = saldoReal + valorDaVenda;
                double subEthereum = saldoEthereum - quantidadeEthereum;
                
                if(quantidadeEthereum > saldoEthereum){
                   JOptionPane.showMessageDialog(vender, "Voce nao tem essa quantidade de ethereum para vender!"); 
                }else{
                   dao.CompraDeBitcoin(pessoa, venda, subEthereum);
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
            
            if(res.next()){
                double saldoReal = res.getDouble("real");
                double saldoRipple = res.getDouble("ripple");
                
                String ripple = JOptionPane.showInputDialog("Digite a quantidade de ripple que deseja vender: ");
                double quantidadeRipple = Double.parseDouble(ripple);
                
                double ripValor = investidor.getCarteira().getMoeda().get(3).getValorDaMoeda();
                
                Ripple rip = new Ripple();
                
                double taxa = rip.taxaDeVenda(quantidadeRipple);
                System.out.println(taxa);
                
                double valorDaVenda = ripValor * quantidadeRipple - taxa;
                System.out.println(saldoReal);
                System.out.println(valorDaVenda);
                
                double venda = saldoReal + valorDaVenda;
                double subRipple = saldoRipple - quantidadeRipple;
                
                if(quantidadeRipple > saldoRipple){
                   JOptionPane.showMessageDialog(vender, "Voce nao tem essa quantidade de ripple para vender!"); 
                }else{
                   dao.CompraDeBitcoin(pessoa, venda, subRipple);
                   JOptionPane.showMessageDialog(vender,"Novo saldo em real: " + venda);
                   JOptionPane.showMessageDialog(vender,"Novo saldo em bitcoin: " + subRipple);
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
