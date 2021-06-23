/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8Interfaz;

/**
 *
 * @author Propietario
 */
public class P8Interfaz {
    public static void main(String[] args) {
        //Se puede crear una referencia de interfaz
        InstrumentoMusical instrumento;
        //Pero no es posible crear una instancia de una interfaz
        //instrumento = new InstrumentoMusical();
        
        //Una referencia a interfaz puede ser asignada a cualquier objeto que la iumplemente
        instrumento = new InstrumentoViento();
        instrumento.tocar();
        instrumento = new Flauta();
        System.out.println(instrumento);
    }
}
