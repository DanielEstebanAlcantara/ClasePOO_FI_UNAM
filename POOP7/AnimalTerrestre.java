/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOP7;

/**
 *
 * @author Alin
 */
public class AnimalTerrestre extends Animal {
    private int numeroPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return super.toString() + "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + '}';
    }
  /////////////////////////////////////////////////////
    public void correr(){
        System.out.println("Estoy corriendo");
    }
   
}
