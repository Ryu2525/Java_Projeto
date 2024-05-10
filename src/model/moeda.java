
package model;

/**
 *
 * @author ryuta
 */
public class Moeda {
    private String nomeMoeda;
    private Double Valor;

    public Moeda(String nomeMoeda, Double Valor) {
        this.nomeMoeda = nomeMoeda;
        this.Valor = Valor;
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

    @Override
    public String toString() {
        return "Moeda{" + "nomeMoeda=" + nomeMoeda + ", Valor=" + Valor + '}';
    }
}
