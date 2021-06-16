/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOP5;

/**
 *
 * @author Propietario
 */
public class Coche {
    
    private String [] lugares = {"NULL", "Chofer", "Copiloto", "Pasajero1", "Pasajero2"};
    private int lugar;
    private Persona per;
    
    public Coche() {
    }

    
    public Coche(int lugar, Persona per) {
        this.lugar = lugar;
        this.per = per;
    }
    
    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public Persona getPer() {
        return per;
    }

    public void setPer(Persona per) {
        this.per = per;
    }
    
    public String miLugar(){
        return lugares[this.lugar];
    }

    @Override
    public String toString() {
        return "Coche{" + "lugares=" + lugares + ", lugar=" + lugar + ", per=" + per + '}';
    }
    
    
    
    
    
    
}
