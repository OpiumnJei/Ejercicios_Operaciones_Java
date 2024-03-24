

//programa que pida dos numeros al usuario y luego los sume. 
package operadores;

import java.util.Scanner;


public class SumaDosNumeros {
    public static void main(String[]args){
    
       Scanner input = new Scanner(System.in);
       
       float n1,n2,r;
       
        System.out.println("Introduzca el primer valor: ");
        n1 = input.nextFloat();
           System.out.println("Introduzca el segundo valor: ");
        n2 = input.nextFloat();
        
        //sumamos
        
        r = n1+n2;
        
        //imprimimos el resultado.
        
        System.out.println("EL resultado es: "+r);
       
       
       
       
       
       
    }
}
