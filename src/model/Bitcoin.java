
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
    
    @Override
    public double taxaDeCompra(double quantidade, double ValorDaMoeda){
        double taxa = (quantidade * ValorDaMoeda) * 0.02;
        return taxa;
    }
    
    
    @Override
    public double taxaDeVenda(double quantidade, double ValorDaMoeda){
        double taxa = (quantidade * ValorDaMoeda) * 0.03;
        return taxa;
    }
}
