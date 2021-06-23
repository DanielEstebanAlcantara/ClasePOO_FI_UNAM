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
public class Triangulo extends Poligono{
    private int alfa, beta, gama;
    private float a, b, c;
    private float base, altura;

    public Triangulo() {
    }
    
    @Override
    public float area() {
        return base * altura/2;
    }

    @Override
    public float perimetro() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
}
