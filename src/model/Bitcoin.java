
package model;

/**
 *
 * @author Julian Ryu Takeda
 */
public class Bitcoin extends Moeda implements Tarifa{
    public Bitcoin(String nomeMoeda, Double Valor, Double ValorDaMoeda) {
        super("Bitcoin", Valor, ValorDaMoeda);
    }

    public Bitcoin() {
    }
    
    double valorDoBitcoin = 325049.64;
    
    @Override
    public double taxaDeCompra(double quantidade){
        double taxa = (quantidade * valorDoBitcoin) * 0.02;
        return taxa;
    }
    
    @Override
    public double taxaDeVenda(double quantidade){
        double taxa = (quantidade * valorDoBitcoin) * 0.03;
        return taxa;
    }
}
