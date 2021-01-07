/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 * Esta es definición de la excepcion que se mostrarará
 * En este caso una vez que se de el caso de la excepción lo que se ejecutará es un mensaje
 * @author Cabal
 */
public class SaldoInsuficienteException extends Exception {
    SaldoInsuficienteException(){
        super("Saldo Insuficiente");
    }
    
    
}
