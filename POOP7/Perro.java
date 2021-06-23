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
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    public Perro() {
    }

    public Perro(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    public Perro(String colorCollar, int numeroPatas) {
        super(numeroPatas);
        this.colorCollar = colorCollar;
    }

    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colorCollar=" + colorCollar + '}';
    }
    //////////////////////////////////////////////////
    public void hacerTrucos(){
        System.out.println("Puedo sentarme cuando me digan");
    }
    
    
}
