/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8Abstract;

/**
 *
 * @author Propietario
 */
public class p8abstract {
    public static void main(String[] args) {
       Poligono poligono;//variable que apunta a una referencia
       poligono = new Cuadrilatero();
       System.out.println(poligono);
        
       poligono = new Triangulo();
       System.out.println(poligono);
    }
}
