/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author unieerialves
 */
public class Carteira{
    private double real, bitcoin, ripple, ethereum;
    private Moeda moeda;

    public Carteira() {
    }

    public Carteira(double real, double bitcoin, double ripple, double ethereum, Moeda moeda) {
        this.real = real;
        this.bitcoin = bitcoin;
        this.ripple = ripple;
        this.ethereum = ethereum;
        this.moeda = moeda;
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

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

    @Override
    public String toString() {
        return "Carteira{" + "real=" + real + ", bitcoin=" + bitcoin + ", ripple=" + ripple + ", ethereum=" + ethereum + ", moeda=" + moeda + '}';
    }
}
