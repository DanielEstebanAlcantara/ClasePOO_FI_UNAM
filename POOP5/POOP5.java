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
public class POOP5 {
    
    public static void main(String[] args){
        Circulo circulo1 = new Circulo(0);
        System.out.println("radio circ1= "+circulo1.getRadio());
        
        Circulo circulo2 = new Circulo();
        System.out.println(circulo2);
        circulo2.setRadio(2);
        System.out.println(circulo2);
        circulo2.setRadio(-10);
        System.out.println(circulo2);
    
    // Ejercicio 2
        System.out.println("################ E2 ################");
        
        Persona per1 = new Persona();
        Fecha fnac = new Fecha();
        
        per1.setNombre("Raul");
        per1.setApellido("Hernandez");
        fnac.setDia(10);
        fnac.setMes(6);
        fnac.setAnio(2000);
        per1.setfNacimiento(fnac);
        
        System.out.println(per1);
        
        System.out.println("Fceha de nacimiento: "+per1.getfNacimiento().getDia()+"/"+per1.getfNacimiento().getMes()+
                "/"+per1.getfNacimiento().getAnio());
        
        System.out.println("Fceha de nacimiento: "+per1.getfNacimiento());
         
    }
    /*
        Implementar clase coche que tenga 4 personas y cada una diga en que lugar está
        *chafer
        *copiloto
        *Pasajero1
        *Pasajero2
    
    */
}
