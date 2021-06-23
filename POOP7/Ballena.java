/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOP7;

/**
 *
 * @author DanielEstban
 */
public class Ballena extends AnimalAcuatico{
    
    private int largo;

    public Ballena() {
    }

    public Ballena(int largo) {
        this.largo = largo;
    }

    public Ballena(int largo, int numeroAletas) {
        super(numeroAletas);
        this.largo = largo;
    }

    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }
           
    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Ballena{" + "largo=" + largo + '}';
    }
    
    ////////////////////////////////////////////////
    
    public void pelearConPinocho(){
        
        System.out.println("Pinocho me esta ganando !!!!");
    }
    
    
}
