/*
 * Realizar un diccionario con 5 palabras usando Hashtable e imprimir todos los elementos
 */
package POOP3;
/**
 *
 * @author Esteban Alcantara
 */

import java.util.Enumeration;
import java.util.Hashtable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hashtable<String,Integer>myTable = new Hashtable<String,Integer>();
        myTable.put("enero", 1);
        myTable.put("febro", 2);
        myTable.put("abril", 4);
        myTable.put("mayo", 5);
        myTable.put("diciembre", 12);
        
        String clave;
        Integer valor;
        
        Enumeration<String> claves = myTable.keys();
        
        System.out.println("MES   AÑO");
        
        for (int i = 0; i < 5; i++) {
            clave = claves.nextElement();
            valor = myTable.get(clave);
            System.out.println(valor +" -> " + clave);
        }
    }   
}    
 



