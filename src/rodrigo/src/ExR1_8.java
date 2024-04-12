//Cálculos de Círculo: Desenvolva um programa para calcular a ÁREA e a CIRCUFERENCIA de um 
// circulo, Utilize formulas matematicas e constantes. ex: PI 3.14

    // Perímetro = 2 * 3,14 * raio.
   // Área = 3,14 * raio *2
   
import java.util.Scanner;

public class ExR1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.print("\nDigite o raio do círculo: ");
        double raio = scanner.nextDouble();        
       
        double area = Math.PI * raio * raio;
        System.out.println("\nA área do círculo é: " + area);
                
        double perimetro = 2 * Math.PI * raio; // THIAGO COLOU DO JAVA PARA ESTUDAR O MATH
        System.out.println("\n O perímetro do círculo é: " + perimetro);
        
        scanner.close();
    }
}




  