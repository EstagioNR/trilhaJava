
/*Conversão de Temperatura: Escreva um programa para converter valores
 * de temperatura entre Celsius e Fahrenheit
 * usando operações aritméticas e entrada do usuário.
 * 
 * (F) para graus Celsius (C) se dá pela fórmula C=5/9. (F-32),
 * ou, de forma equivalente por C=(F-32)/1,8.*/
 

import java.util.Scanner;

public class ExR1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEscolha a conversão desejada:");  
        System.out.print("1. Celsius para Fahrenheit"); // ESOLHA UM OU OUTRO F° OU C° sem ln o texto de baixo fica junto com o de cima 
        System.out.println("2. Fahrenheit para Celsius");

        int opcao = scanner.nextInt(); 

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * 9/5 + 32;
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");
        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("A temperatura em Celsius é: " + celsius + "°C");
        } else {
            System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }
}
