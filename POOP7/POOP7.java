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
public class POOP7 {
    
    public static void main(String[] args){
    
    Gerente ger = new Gerente();
    
        ger.setNombre("Saul Juarez");
        ger.setNumEmpleado(9638);
        ger.setSueldo(16000);
    
        System.out.println(ger);
        System.out.println(ger.getNombre());
        System.out.println(ger.getSueldo());
        
        ger.aumentarSueldo(10);
        System.out.println(ger.getSueldo());
        
        ger.asignarPresupuesto(100000);
        System.out.println(ger.getPresupuesto());
        
        System.out.println("########## E2 ##########");
        if(ger instanceof Empleado){
            System.out.println("Instancia de Empleado");
        }
        
        if (ger instanceof Object){
            System.out.println("Instancia de Objeto");
        }
        
        System.out.println("########## E3 ##########");
        Gerente ger2 = new Gerente(500000, "Andrea Axul", 2000, 1243);
        System.out.println(ger2);
    }
}
