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
public class Circulo {
    //se le debe de poner reglas de visibilidad
    static float PI = 3.14159f; //static por que es una constante
    private float radio;

    
    public Circulo(){
        
    }
    
    public Circulo(float radio) {
        this.radio = radio;
    }

    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if (radio<0)
            this.radio = 0;
        else
            this.radio = radio;
    }
    
    public float perimetro(){
        return 2 * PI * radio;
    }
    
    public float area(){
        return PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
  
     
}
