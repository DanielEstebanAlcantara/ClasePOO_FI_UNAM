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
public class POOP4 {
    
    public static void main(String[] args){
        
        Punto punto1 = new Punto();
        punto1.imprimePunto();
        punto1.x = 7;
        punto1.y = 2;
        punto1.imprimePunto();
        
        Punto punto2 = new Punto(9, 5);
        punto2.imprimePunto();
        
        ////////////////////////////////////////////
        
        Perro perro1 = new Perro("dalmata");
        perro1.ladrar();
        
        
        Perro perro2 = new Perro("Ramiro", "Salchicha");
        perro2.dormir();
           
        
        ////////////////////////////////////////////
                
        Alumno miAlumno = new Alumno("Paquita",317096604,20,(float)8.99,6);
        System.out.println(miAlumno);
        miAlumno.estudiar();
        miAlumno.leer("Harry Poter");
        miAlumno.aprobar("POO");
        
        ////////////////////////////////////////////
        
        System.out.println("\n\n////////////////////////////////////////////\n\n");
        
        Coche auto1 = new Coche("Tesla", "Blanco", 2015, 152545, 250000.25f);
        auto1.acelerar();
        auto1.encender();
        auto1.comprar();
        auto1.verificacion();
        auto1.pintar();
        
        System.out.println("\n\n////////////////////////////////////////////\n\n");
    }
    
}
