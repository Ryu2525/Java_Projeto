
package model;

/**
 *
 * @author unieerialves
 */
public class Ethereum extends Moeda implements Tarifa{

    public Ethereum(String nomeMoeda, Double Valor, Double ValorDaMoeda) {
        super("Ethereum", Valor, 15242.44);
    }

    public Ethereum() {
    }
    
    double valorDoBitcoin = 15242.44;
    
    @Override
    public double taxaDeCompra(){
        double taxa = valorDoBitcoin * 0.01;
        return taxa;
    }
    
    @Override
    public double taxaDeVenda(){
        double taxa = valorDoBitcoin * 0.02;
        return taxa;
    }
    
}
