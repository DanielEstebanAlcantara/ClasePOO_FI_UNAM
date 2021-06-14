/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOP4;

/**
 *
 * @author DanielEsteban
 */
public class Coche {
    String marca;
    String color;
    int modelo;
    int placas;
    float costo;

    public Coche(String marca, String color, int modelo, int placas, float costo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.placas = placas;
        this.costo = costo;
    }
    
    public void comprar(){
        System.out.println("Voy a comprar un auto "+marca+" modelo "+modelo+" y voy a pagar $"+costo+".");
    }
    
    public void verificacion(){
        System.out.println("Se llevó a verificar el coche con placas "+placas);
    }
    
    public void pintar(){
        System.out.println("Mi coche ahora es de color "+color);
    }
    
    public void encender(){
        System.out.println("Para encender el auto Tesla no se necesita gasolina");
    }
    
    public void acelerar(){
        System.out.println("Un Tesla puede hacelerar de 0 a 100 km/h en 6 segundos");
    }
}


