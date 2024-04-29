
package model;

/**
 *
 * @author Julian Ryu Takeda
 */
public class Bitcoin {
    private double saldo;
    private String extrato;

    public Bitcoin(double saldo, String extrato) {
        this.saldo = saldo;
        this.extrato = extrato;
    }

    public Bitcoin() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }

    @Override
    public String toString() {
        return "Bitcoin{" + "saldo=" + saldo + ", extrato=" + extrato + '}';
    }
}
