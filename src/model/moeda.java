
package model;

/**
 *
 * @author ryuta
 */
public class Moeda {
    private double taxacompra, taxavenda, valor;
    private String nomeDaMoeda;

    public Moeda(double taxacompra, double taxavenda, double valor, String nomeDaMoeda) {
        this.taxacompra = taxacompra;
        this.taxavenda = taxavenda;
        this.valor = valor;
        this.nomeDaMoeda = nomeDaMoeda;
    }

    public double getTaxacompra() {
        return taxacompra;
    }

    public void setTaxacompra(double taxacompra) {
        this.taxacompra = taxacompra;
    }

    public double getTaxavenda() {
        return taxavenda;
    }

    public void setTaxavenda(double taxavenda) {
        this.taxavenda = taxavenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeDaMoeda() {
        return nomeDaMoeda;
    }

    public void setNomeDaMoeda(String nomeDaMoeda) {
        this.nomeDaMoeda = nomeDaMoeda;
    }

    @Override
    public String toString() {
        return "Moeda{" + "taxacompra=" + taxacompra + ", taxavenda=" + taxavenda + ", valor=" + valor + ", nomeDaMoeda=" + nomeDaMoeda + '}';
    }
}
