/*
 * Realizar una agenda con 5 registros guardando nombre de persona y su 
 * cumpleaños usando Hashtable y calendar e imprimir todos los elementos
 */
package POOP3;

/**
 *
 * @author Esteban Alcantara
 */
import java.text.ParseException;
import java.util.Hashtable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;

public class Ejercicio2 {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        
        Date fechaEsteban = formatoFecha.parse("20-05-2021");
        Date fechaDaniel = formatoFecha.parse("15-04-2021");
        Date fechaMiguel = formatoFecha.parse("09-05-2021");
        Date fechaSebastian = formatoFecha.parse("10-12-2021");
        Date fechaMatias = formatoFecha.parse("21-02-2021");
        
        
        
        Hashtable<String, String> agenda = new Hashtable<String,String>();
        agenda.put("Esteban Alcantara", formatoFecha.format(fechaEsteban));
        agenda.put("Daniel Paleo", formatoFecha.format(fechaDaniel));
        agenda.put("Miguel Angel", formatoFecha.format(fechaMiguel));
        agenda.put("Sebastian Estrada", formatoFecha.format(fechaSebastian));
        agenda.put("Matias Marquez", formatoFecha.format(fechaMatias));
        
        String clave;
        String valor;
        Enumeration<String> claves = agenda.keys();
        
        for (int i = 0; i < 5; i++) {
            clave = claves.nextElement();
            valor = agenda.get(clave);
            System.out.println(clave + " cumple años el "+ valor);
        }
        
    }
}
