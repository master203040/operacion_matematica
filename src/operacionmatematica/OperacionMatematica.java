
package operacionmatematica;

import java.util.Scanner;


public class OperacionMatematica {

    public static void main(String[] args) {
        
        int numero1 = 0;
        int numero2 = 0;
        int resultado; 
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("digite el primer numero");
        numero1=leer.nextInt();
        
        System.out.println("digite el segundo numero");
        numero2= leer.nextInt(); 
        metodo(numero1 ,numero2);
    }
   
    private static void metodo(int val1, int val2) {
        
        int resultado = 0;
        try {
            resultado= val1/val2;
        } catch (Exception e) {
            resultado=0;
            System.out.println("error en el resultado");
        }finally{
        
            System.out.println("el resultado de la operacion: " +resultado);
        }
    }
    
}
