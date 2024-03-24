
/*
Construir un programa que calcule y muestre por pantalla las raices de la ecuacion de segundo grado de coeficientes reales
*/
package operadores;

import java.util.Scanner;


public class Ecuacion2doGrado {
    public static void main(String[]args){
    
    
Scanner entrada = new Scanner(System.in); 
int a,b,c; 
double raiz1,raiz2,resultado1,resultado2; 

System.out.print("Introduce el valor de A: "); 
a = entrada.nextInt(); 
System.out.print("Introduce el valor de B: "); 
b = entrada.nextInt(); 
System.out.print("Introduce el valor de C: "); 
c = entrada.nextInt(); 

resultado1 = (b*b) - 4*(a*c); 
raiz1 = Math.sqrt(resultado1) + (-b); 
resultado1 = raiz1 / 2 * a; 
System.out.print("El primer resultado es: "+resultado1); 

resultado2 = (b*b) - 4*(a*c); 
raiz2 = Math.sqrt(resultado2) - (-b); 
resultado2 = raiz2 / 2 * a; 
System.out.print("\nEl segundo resultado es: "+resultado2); 
System.exit(0); 
    }
    
}
