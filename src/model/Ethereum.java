
package model;

/**
 *
 * @author unieerialves
 */
public class Ethereum extends Moeda implements Tarifa{

    public Ethereum(String nomeMoeda, Double Valor, Double ValorDaMoeda) {
        super("Ethereum", Valor, ValorDaMoeda);
    }

    public Ethereum() {
    }
    
    double valorDoBitcoin = 15242.44;
    
    @Override
    public double taxaDeCompra(double quantidade){
        double taxa = (quantidade * valorDoBitcoin) * 0;
        return taxa;
    }
    
    @Override
    public double taxaDeVenda(double quantidade){
        double taxa = (quantidade * valorDoBitcoin) * 0;
        return taxa;
    }
    
}
