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
public class Cajero {
    public static void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria();
        try{
            cuenta.depositar(1000);
            cuenta.getSaldo();
            cuenta.retirarmonto(2000);
            cuenta.getSaldo();
        }catch(SaldoInsuficienteException sie){
            System.out.println("No tienes saldo suficiente");
        }
        
    }
    
}
