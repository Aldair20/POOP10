/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop10;

/**
 *
 * @author Cabal
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1---------------------------------------------------------------");
        try{
            String mensajes[] = {"Antonio", "Javier", "Gabriela"};
            for (int i = 0; i < 4; i++) {
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error; apuntador fuera de rango");
        }
        
        System.out.println("2-----------------------------------------------------------------");
        try{
            float equis = 5 / 5;
            System.out.println("Equis es igual a:"+equis);
        }catch(ArithmeticException ae){
            System.out.println("Error división entre cero");
        }finally{
            System.out.println("A pesar de todo, se ejecuta finally");
        }
        System.out.println("Fuera de try-catch");
        
        System.out.println("3------------------------------------------------------------------");
        try{
            float equis = 5 / 0;
            System.out.println("Equis es igual a:"+equis);
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error; apuntador fuera de rango");
        }catch(ArithmeticException ae){
            System.out.println("Error división entre cero");
        }catch(Exception e){
                System.out.println("Excepción general");
        }finally{
            System.out.println("A pesar de todo, se ejecuta finally");
        }
        System.out.println("Fuera de try-catch");
        
        System.out.println("4----------------------------------------------------------------------");
        //propagación  de exceptions
        /*try{
            int division = division(8, 0);
            System.out.println("Division = "+division);
        }catch(ArithmeticException ae){
            System.out.println("Excepcion aritmetica");
            //ae.printStrackTrace
        }*/
        int a = division(9, 0);
        
        System.out.println("5----------------------------------------------------------------------");
        //propagación  de exceptions
        try{
            int division = division2(8, 0);
            System.out.println("Division = "+division);
        }catch(ArithmeticException ae){
            System.out.println("Excepcion aritmetica");
            //ae.printStrackTrace
        }   
        
    }
        
    
    public static int division(int a, int b) throws ArithmeticException {
        int c;
        try{
            c = a / b;
        }catch(ArithmeticException g){
            c = 0;
            System.out.println("Excepcion aritmetica");
            System.out.println("C = "+c);
        }
        return c;
    }
    
    public static int division2(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException();
        }int c = a / b;
        return c;
    }
}