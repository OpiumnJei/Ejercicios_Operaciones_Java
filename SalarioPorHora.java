
/*
hacer un programa que calcule e imprima el salario semanal de un trabajador
basandose en las horas trajadas en la semana y su salario por hora. 

Sueldo por hora = 87.5 pesos

*/
package operadores;

import java.util.Scanner;

public class SalarioPorHora {
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        //salario por hora:
        int salarioH = 85, sueldo;
        
        System.out.println("Introduzca las horas trabajadas: ");
        sueldo = input.nextInt();
        
        sueldo*=salarioH;
        
        System.out.println("Su sueldo es: "+sueldo);
        
        
    }
    
}
