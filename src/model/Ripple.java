
package model;

/**
 *
 * @author unieerialves
 */
public class Ripple extends Moeda implements Tarifa{

    public Ripple(String nomeMoeda, Double Valor, Double ValorDaMoeda) {
        super("Ripple", Valor, ValorDaMoeda);
    }

    public Ripple() {
    }
    
    double valorDoBitcoin = 2.62;
    
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
