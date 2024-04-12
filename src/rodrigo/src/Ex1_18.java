import java.util.Scanner;

public class Ex1_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Verifica se o número é negativo
        if (numero < 0) {
            System.out.println("O número deve ser não negativo.");
        } else {
            int fatorial = 1;
            int i = 1;
            
            // Calcula o fatorial usando um loop while
            while (i <= numero) {
                fatorial *= i;
                i++;
            }
            
            // Exibe o resultado
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}
