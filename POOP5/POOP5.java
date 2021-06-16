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
        System.out.println("radio circulo= "+circulo1.getRadio());
        
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
         
    
    /*
        Implementar clase coche que tenga 4 personas y cada una diga en que lugar está
        *chafer
        *copiloto
        *Pasajero1
        *Pasajero 2
        *Un coche tiene una persona que tiene una fecha de nacimiento 
        
    
    */
    
        System.out.println("################ E3 ################");
    
        Coche c1 = new Coche();
        Persona perC1 = new Persona();
        Fecha fnac1 = new Fecha();
       
        perC1.setNombre("Raul");
        perC1.setApellido("Hernandez");
        c1.setLugar(1);
        fnac1.setDia(10);
        fnac1.setMes(6);
        fnac1.setAnio(2000);
        perC1.setfNacimiento(fnac1);
        c1.setPer(perC1);
        System.out.println(" "+perC1+"\nOcupa el puesto: "+c1.getLugar()+": "+c1.miLugar()+"\n");
        
        Coche c2 = new Coche();
        Persona perC2 = new Persona();
        Fecha fnac2 = new Fecha();
       
        perC2.setNombre("Esteban");
        perC2.setApellido("Alcantara");
        c2.setLugar(2);
        fnac2.setDia(15);
        fnac2.setMes(5);
        fnac2.setAnio(1999);
        perC2.setfNacimiento(fnac2);
        c2.setPer(perC2);
        System.out.println(" "+perC2+"\nOcupa el puesto: "+c2.getLugar()+": "+c2.miLugar()+"\n");
        
        Coche c3 = new Coche();
        Persona perC3 = new Persona();
        Fecha fnac3 = new Fecha();
        
        perC3.setNombre("Miguel");
        perC3.setApellido("Fernandez");
        c3.setLugar(3);
        fnac3.setDia(12);
        fnac3.setMes(5);
        fnac3.setAnio(1999);
        perC3.setfNacimiento(fnac3);
        c3.setPer(perC3);
        System.out.println(" "+perC3+"\nOcupa el puesto: "+c3.getLugar()+": "+c3.miLugar()+"\n");
        
        Coche c4 = new Coche();
        Persona perC4 = new Persona();
        Fecha fnac4 = new Fecha();
        
        perC4.setNombre("María");
        perC4.setApellido("Fernandez");
        c4.setLugar(4);
        fnac4.setDia(1);
        fnac4.setMes(2);
        fnac4.setAnio(2001);
        perC4.setfNacimiento(fnac3);
        c4.setPer(perC3);
        System.out.println(" "+perC4+"\nOcupa el puesto: "+c4.getLugar()+": "+c4.miLugar()+"\n");
        
        
        
    
    
    
    } 
}
