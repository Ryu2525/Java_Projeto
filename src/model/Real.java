
package model;

/**
 *
 * @author Julian
 */
public class Real extends Moeda implements Tarifa{

    public Real(String nomeMoeda, Double Valor, Double ValorDaMoeda) {
        super("Real", Valor, 0.0);
    }

    public Real() {
    }
    
    double valorDoBitcoin = 0.0;
    
    @Override
    public double taxaDeCompra(){
        double taxa = valorDoBitcoin * 0;
        return taxa;
    }
    
    @Override
    public double taxaDeVenda(){
        double taxa = valorDoBitcoin * 0;
        return taxa;
    }
            
}
