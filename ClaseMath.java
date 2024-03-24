
//Metodo 1: Math.sqrt(numero)
//Metodo 2: elevar a potencia (Math.pow)
//Metodo 3: redondear número (Math.round)


package operadores;


public class ClaseMath {
    public static void main(String[]args){
    
        //Metodo 1: se usa para sacar la raiz cuadrada
        
        int n1 = (int)Math.sqrt(9);
    
        System.out.println("La raiz de 9 es: "+n1);
        
        //Metodo 2: se usa para elevar x numero a y potencia
        
        double base = 5, exponente = 2, resultado;
        
        resultado = Math.pow(base, exponente);
        
        System.out.println("El resultado es: "+resultado);
        
        //Metodo 3: redondear número (Math.round)
        
        float numero = 3.58f;
        int resultado2 = Math.round(numero);
        
        System.out.println(numero+" redondeado es: "+resultado2);
        
        
        
    }
}
