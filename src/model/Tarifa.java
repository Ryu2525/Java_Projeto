
package model;

/**
 *
 * @author ryuta
 */
public interface Tarifa {
    double taxaDeCompra(double quantidade, double ValorDaMoeda);
    double taxaDeVenda(double quantidade, double ValorDaMoeda);
//    double cotacao();
}
