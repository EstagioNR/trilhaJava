//              2. Estruturas Condicionais:
// Atribuição de Notas: Desenvolva um programa que atribui notas de letras (A, B, C, etc.
//aos alunos com base em suas pontuações percentuais. Use instruções if-else ou switch para categorizar as pontuações em


import java.util.Scanner;

public class Ex2_2 {

    public static char atribuirNota(double pontuacao) {
        if (pontuacao >= 90) {
            return 'A';
        } else if (pontuacao >= 80) {
            return 'B';
        } else if (pontuacao >= 70) {
            return 'C';
        } else if (pontuacao >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Digite a pontuação percentual do aluno: ");
        double pontuacao = scanner.nextDouble();

        if (pontuacao < 0 || pontuacao > 100) {
            System.out.println("Pontuação inválida. A pontuação deve estar entre 0 e 100.");
        } else {
            char nota = atribuirNota(pontuacao);
            System.out.println("A nota do aluno é: " + nota);
        }

        scanner.close();
    }
}
