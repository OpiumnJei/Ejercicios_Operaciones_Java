
/*
Una compañia de ventas de carros usados, paga a su personal de 
ventas un salario de $1000 mensuales, 
mas una comisión de $150 por cada carro vendido, 
más el 5% del valor de la venta por carro. 
Cada mes el capturista de la empresa ingresa en la computadora los 
datos pertinentes. Hacer un programa que 
calcule e imprima el salario mensual de un vendedor dado. 
 */

package operadores;

import java.util.Scanner;

public class SalarioAutos {
    public static void main(String[]args){
    
       Scanner input = new Scanner(System.in); 

final int Base = 1000;  
int cantidadV; 
double Pcarro, salarioF; 
double comision; 


System.out.print("Introduzca la cantidad de autos vendidos: "); 
cantidadV = input.nextInt(); 

Pcarro = (cantidadV * 100000) *  0.05; 
comision = (cantidadV * 150) + Pcarro; 
salarioF = Base + comision; 

System.out.print("Salario Final: " + salarioF);
        
    
    }
}
