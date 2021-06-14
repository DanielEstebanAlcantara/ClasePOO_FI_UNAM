/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploComposicion;

/**
 *
 * @author DanielEsteban
 */
public class PruebaPersona {
    public static void main(String[] args){
        Persona per1 = new Persona();
        per1.setNombre("Esteban");
        per1.setApellido("Alcantara");
        per1.setFNacimiento(9, 5, 2021);
        
        System.out.println("Nombre: "+ per1.getNombre());
        System.out.println("Apellido: "+ per1.getApellido());
        System.out.println("Fecha de Nacimiento: "+ per1.getFNacimiento());
    }
}
