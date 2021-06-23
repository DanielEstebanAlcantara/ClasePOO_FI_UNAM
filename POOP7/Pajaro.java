/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOP7;

/**
 *
 * @author Propietario
 */
public class Pajaro extends AnimalAereo {
    private String pico;

    public Pajaro() {
    }

    public Pajaro(String pico) {
        this.pico = pico;
    }

    public Pajaro(String pico, int numeroAlas) {
        super(numeroAlas);
        this.pico = pico;
    }

    public Pajaro(String pico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.pico = pico;
    }
            
    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "Pajaro{" + "pico=" + pico + '}';
    }

    public void recolectarRama(){
        System.out.println("Voy a usar esta rama para hacer mi nido");
    }
    
    
    
    
}
