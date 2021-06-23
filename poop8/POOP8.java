/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop8;

/**
 *
 * @author Propietario
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poligono poligono = new Poligono();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        Triangulo triangulo = new Triangulo();
                
        System.out.println(poligono);
        System.out.println(cuadrilatero);
        System.out.println(triangulo);
        
        Poligono pol;//variable vacia
        //System.out.println(pol);//no se va a poder imprimir
        pol = new Poligono();
        System.out.println(pol);
        
        Object objeto;
        objeto = pol;//apunta a su referencia, las variables de tipo objeto copian la referencia
        System.out.println(objeto);
        
        pol = triangulo;
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(pol);
        System.out.println(objeto);
        
        System.out.println("######## Ej2 ########");
        getPoligono(cuadrilatero);
        getPoligono(triangulo);
        getPoligono(poligono);
        
        
    }

    public static void getPoligono(Poligono p){//Las cosas static se quedan en toda la ejecución del programa//Va a recibir las clases hijo de Poligono
        if(p instanceof Triangulo){
            System.out.println("Esta es un triangulo");
        }else if(p instanceof Cuadrilatero){
            System.out.println("Esto es un cuadrilatero");
        }else{
            System.out.println("Es un poligono");
        }
    }
    
}
