
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
    
    @Override
    public double taxaDeCompra(double quantidade, double ValorDaMoeda){
        double taxa = (quantidade * ValorDaMoeda) * 0.01;
        return taxa;
    }
    
    @Override
    public double taxaDeVenda(double quantidade, double ValorDaMoeda){
        double taxa = (quantidade * ValorDaMoeda) * 0.02;
        return taxa;
    }
    
}
