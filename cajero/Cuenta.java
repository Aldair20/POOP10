/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 * En esta parte se diseña una clase
 * @author Cabal
 */
public class Cuenta {
    private double saldo;
    
    /**
     * Constructor que inicializa el saldo de nuestra cuenta en 0
     */
    public Cuenta() {
        this.saldo = 0;
    }
    
    /**
     * Metodo Get 
     * @return Saldo actual en nuestra cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Metodo depositar cantidad de dinero en la cuenta
     * @param monto, Recibe la cantidad de dinero a depositar en la cuenta
     */
    public void depositar(double monto){
        System.out.println("Depositando: "+monto+" pesos \n");
        saldo += monto;
    }
    
    /**
     * Metodo retirar
     * @param monto, Recibe la cantidad de dinero que se va a depositar 
     * @throws SaldoInsuficienteException, esta es la excepción que puede ser lanzada dentro de este método
     * que se mostrará en cuanto el saldo que recibe al realizar un retiro sea mayor que el saldo actual
     */
    public void retirar(double monto) throws SaldoInsuficienteException {
        System.out.println("Retirando monto.....");
        if(saldo < monto){
            throw new SaldoInsuficienteException();
        }else{
        saldo -= monto;}
        
        System.out.println("Nuevo saldo es: "+saldo+" pesos\n");
        
    }
}
