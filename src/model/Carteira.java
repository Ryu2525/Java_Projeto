/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author unieerialves
 */
public class Carteira{
    ArrayList<Moeda> moeda;

    public Carteira(){
        moeda = new ArrayList<Moeda>();
    }
    
    public Carteira(ArrayList<Moeda> moeda){
        this.moeda = moeda;
    }

    public ArrayList<Moeda> getMoeda() {
        return moeda;
    }

    public void setMoeda(ArrayList<Moeda> moeda) {
        this.moeda = moeda;
    }
    
    
}
