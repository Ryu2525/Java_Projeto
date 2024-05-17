
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
    
    @Override
    public double taxaDeCompra(double quantidade, double ValorDaMoeda){
        double taxa = (quantidade * ValorDaMoeda) * 0.01;
        return taxa;
    }
    
    @Override
    public double taxaDeVenda(double quantidade, double ValorDaMoeda){
        double taxa = (quantidade * ValorDaMoeda) * 0.01;
        return taxa;
    }
}
