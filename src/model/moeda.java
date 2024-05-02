
package model;

/**
 *
 * @author Julian Ryu Takeda
 */
public class moeda {
    private double real, bitcoin, ripple, ethereum;

    public moeda(double real, double bitcoin, double ripple, double ethereum) {
        this.real = real;
        this.bitcoin = bitcoin;
        this.ripple = ripple;
        this.ethereum = ethereum;
    }

    public moeda() {
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(double bitcoin) {
        this.bitcoin = bitcoin;
    }

    public double getRipple() {
        return ripple;
    }

    public void setRipple(double ripple) {
        this.ripple = ripple;
    }

    public double getEthereum() {
        return ethereum;
    }

    public void setEthereum(double ethereum) {
        this.ethereum = ethereum;
    }

    @Override
    public String toString() {
        return "moeda{" + "real=" + real + ", bitcoin=" + bitcoin + ", ripple=" + ripple + ", ethereum=" + ethereum + '}';
    }
}
