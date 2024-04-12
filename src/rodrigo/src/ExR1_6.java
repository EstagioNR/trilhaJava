
//Exploração da Classe Math: Explore os recursos da classe (Math) 
// escrevendo código para calcular a raiz quadrada, 
// o valor absoluto e a potência de um número. 

import java.util.Scanner;

public class ExR1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um número: ");
        double numero = scanner.nextDouble();

        double raizQuadrada = Math.sqrt(numero);
        System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada);

        double valorAbsoluto = Math.abs(numero);
        System.out.println("O valor absoluto de " + numero + " é " + valorAbsoluto);

        double quadrado = Math.pow(numero, 2);
        System.out.println("AO quadrado de " + numero + " é " + quadrado);

        scanner.close();
    }
}



   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
