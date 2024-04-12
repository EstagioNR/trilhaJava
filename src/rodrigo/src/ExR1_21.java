
// Tabuada: Gere a tabuada para um determinado número usando loops aninhados. 
// A tabela deve exibir o produto do número e cada inteiro de 1 a 10.

import java.util.Scanner;

public class ExR1_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }

}





