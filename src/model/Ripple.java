
package model;

/**
 *
 * @author unieerialves
 */
public class Ripple extends Moeda implements Tarifa{

    public Ripple(String nomeMoeda, Double Valor, Double ValorDaMoeda) {
        super("Ripple", Valor, 2.62);
    }

    public Ripple() {
    }
    
    double valorDoBitcoin = 2.62;
    
    @Override
    public double taxaDeCompra(){
        double taxa = valorDoBitcoin * 0.01;
        return taxa;
    }
    
    @Override
    public double taxaDeVenda(){
        double taxa = valorDoBitcoin * 0.01;
        return taxa;
    }
}
