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
        
        ////////////////////////////////////////////////////////////////
        System.out.println("\n########## Actividades Extra ##########\n");
        /////////Animal Acuatico
        System.out.println("\n########## Animal Acuatico ##########\n");
        Ballena md = new Ballena();
        md.setNombre("Movy Dick");
        md.setLugarOrigen("Oceano Antartico");
        md.setColor("Azul");
        md.setNumeroAletas(2);
        md.setLargo(25);
        md.sonido("hOOOlAAA");
        md.pelearConPinocho();
        md.comer();
        md.nadar();
        System.out.println(md);
        
        //////// Animal Terrestre
        System.out.println("\n########## Animal Terrestre ##########\n");
        
        //////// Animal Aereo
        System.out.println("\n########## Animal Aereo ##########\n");
        Pajaro tucan = new Pajaro();
        tucan.setNombre("Sam");
        tucan.setLugarOrigen("Bosque Húmedo de México");
        tucan.setColor("Negro");
        tucan.setNumeroAlas(2);
        tucan.setPico("Mi pico es de varios colores");
        tucan.sonido("Canto");
        tucan.comer();
        tucan.volar();
        tucan.recolectarRama();
        System.out.println(tucan);
        
    }
}
