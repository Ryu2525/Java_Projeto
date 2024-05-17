
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
    
    @Override
    public double taxaDeCompra(double quantidade, double valorDaMoeda){
        double taxa = (quantidade * valorDaMoeda) * 0;
        return taxa;
    }
    
    @Override
    public double taxaDeVenda(double quantidade, double valorDaMoeda){
        double taxa = (quantidade * valorDaMoeda) * 0;
        return taxa;
    }
            
}
