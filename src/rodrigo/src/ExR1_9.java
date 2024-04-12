
//Avaliação de Notas do Aluno: Escreva um programa para determinar
//se um aluno foi aprovado ou reprovado com base na nota do exame. Use uma instrução
// if-else para verificar se a nota está acima ou abaixo do limite de aprovação.

import java.util.Scanner;

public class ExR1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as 2 notas do aluno: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        

        double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

        scanner.close();
           }
}
