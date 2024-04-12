//                         Estruturas Condicionais:
//Encontrando o Maior Número: Crie um programa para encontrar o maior entre três números
// fornecidos. Empregue instruções if-else aninhadas para comparar os números



import java.util.Scanner;

public class ExR2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o primeiro numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro numero:");
        double num3 = scanner.nextDouble();

        double maior;

        if (num1 >= num2) {
            if (num1 >= num3) {
                maior = num1;
            } else {
                maior = num3;
            }
        } else {
            if (num2 >= num3) {
                maior = num2;
            } else {
                maior = num3;
            }
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
