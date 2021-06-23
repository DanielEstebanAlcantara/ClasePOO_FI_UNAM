/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOP7;

/**
 *
 * @author DanielEsteban
 */
public class AnimalAcuatico extends Animal{
    private int numeroAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }

    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
     @Override
    public String toString() {
        return  super.toString() +
            "AnimalAcuatico{" + "numeroAletas=" + numeroAletas + '}';
    }
            
    ////////////////////////////////////////////////////
    
    public void nadar(){
        System.out.println("Estoy nadando");
    }
     
    
}
