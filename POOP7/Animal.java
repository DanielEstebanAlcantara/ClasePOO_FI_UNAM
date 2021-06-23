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
public class Animal {
    
    private String nombre;
    private String lugarOrigen;
    private String color;

    public Animal() {
    }

    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
      
    //////////////////////

    public void sonido( String sound ){
        System.out.println("El sonido que hace "+this.nombre + " es "+sound);
    }
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
    
    
}
