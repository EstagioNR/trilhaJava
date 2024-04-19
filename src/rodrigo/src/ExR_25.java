//Função Par/Ímpar: Crie uma função chamada ePar que recebe um argumento 
//inteiro e retorna verdadeiro se o número for par e falso caso contrário.

import java.util.Scanner;

public class ExR_25
 {
    public static boolean ePar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        if (ePar(numero)) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }

        scanner.close();
    }
}



        

    





    

