/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10miexcepcion;

/**
 *
 * @author Propietario
 */
public class CuentaBancaria {
    
    private double saldo;

    public CuentaBancaria() {
        saldo = 0;
    }

    public double getSaldo() {
        System.out.println("Saldo: "+saldo);
        return saldo;
    }
    
    public void depositar(double monto){
        System.out.println("Depositando "+monto+" pesos");
        saldo += monto;
    }
    
    public void retirarmonto(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando " + monto);
        if (saldo < monto){
            throw new SaldoInsuficienteException();
        }else{
            saldo -= monto; 
        }
        
    }
    
    
    
    
}
