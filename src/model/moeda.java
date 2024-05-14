
package model;

/**
 *
 * @author ryuta
 */
public class Moeda {
    private String nomeMoeda;
    private Double Valor;
    private Double ValorDaMoeda;

    public Moeda(String nomeMoeda, Double Valor, Double ValorDaMoeda) {
        this.nomeMoeda = nomeMoeda;
        this.Valor = Valor;
        this.ValorDaMoeda = ValorDaMoeda;
    }

    public Moeda() {
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public void setNomeMoeda(String nomeMoeda) {
        this.nomeMoeda = nomeMoeda;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    public Double getValorDaMoeda() {
        return ValorDaMoeda;
    }

    public void setValorDaMoeda(Double ValorDaMoeda) {
        this.ValorDaMoeda = ValorDaMoeda;
    }
    
    @Override
    public String toString() {
        return "Moeda{" + "nomeMoeda=" + nomeMoeda + ", Valor=" + Valor + '}';
    }
}
