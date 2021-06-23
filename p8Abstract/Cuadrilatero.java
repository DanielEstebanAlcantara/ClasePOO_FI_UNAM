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
public class Cuadrilatero extends Poligono{
    private int alfa, beta;
    private float a, b;
    private float base, altura;

    public Cuadrilatero() {
    }       
    
    @Override
    public float area() {
        return base*altura;
    }

    @Override
    public float perimetro() {
        return 2*(a+b);
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }   
    
}
