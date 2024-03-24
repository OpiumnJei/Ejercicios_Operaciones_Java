/*
programa que calcule el cuadrado de una suma: 

(a+b)^2 = a^2+b^2+2*(a*b)
*/
package operadores;

import java.util.Scanner;

public class CuadradoSuma {
    public static void main(String[]args){
    
    Scanner inp = new Scanner(System.in);
    int a,b,resultado;
    
        System.out.println("Introduzca un valor para (a): ");
        a = inp.nextInt();
        System.out.println("Introduzca un valor para (b): ");
        b = inp.nextInt();
        resultado = (a*a)+(b*b)+2*(a*b);
        
        System.out.println("El resultado es: "+resultado);
        
    
    }
}
