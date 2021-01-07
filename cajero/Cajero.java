/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 * Podemos generear nuesras propias excepciones, todas estas heredan de la clase exception
 * @author Cabal
 */
public class Cajero {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(500);
        try{
            cuenta.retirar(300);
            cuenta.retirar(100);
            cuenta.retirar(200);
        }catch(SaldoInsuficienteException e){
            System.out.println("Saldo insuficiente");
        }
        
        //actividad queda recibir parametros del teclado,  = input.readDouble();
        System.out.println("\n\n-----------------------------------------------------");
        KeyboardInput input = new KeyboardInput();
        Cuenta cuentateclado = new Cuenta();
        int op = 0;
        double cantidad;
        System.out.println("\nCuenta nueva:\nSelecciona lo que deseas hacer: (colocando el numero) ");
        
        while(op != 4){
            System.out.println("\n1.-Depositar\n2.-Retirar\n3.-Consulta de saldo\n4.-Salir");
            op = input.readInteger();
            if(op == 1){
                System.out.println("Ingresa el monto a depositar: ");
                cantidad = input.readDouble();
                cuentateclado.depositar(cantidad);
            }
            
            if(op == 2){
                System.out.println("Ingresa el monto a retirar: ");
                cantidad = input.readDouble();
                try{
                    cuentateclado.retirar(cantidad);
                }catch(SaldoInsuficienteException e){
                    System.out.println("Saldo insuficiente");
                }
            }
            
            if(op == 3){
                System.out.println("El saldo actual es: ");
                System.out.println(cuentateclado.getSaldo());
            }
            
            if(op == 4) break;
            
        }
    }
}
