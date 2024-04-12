//         2. Estruturas Condicionais:
//Dia da Semana: Implemente um programa que exibe o dia da semana correspondente a um
//determinado número (1-7) usando uma instrução switch. Lide com valores de entrada inválidos adequadamente.





import java.util.Scanner;

public class ExR1_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7 para obter o dia da semana correspondente: ");
        int numero = scanner.nextInt();

        String diaDaSemana;
        switch (numero) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-feira";
                break;
            case 3:
                diaDaSemana = "Terça-feira";
                break;
            case 4:
                diaDaSemana = "Quarta-feira";
                break;
            case 5:
                diaDaSemana = "Quinta-feira";
                break;
            case 6:
                diaDaSemana = "Sexta-feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "Número inválido. Insira um número de 1 a 7.";
                break;
        }

        System.out.println("O dia da semana correspondente ao número " + numero + " é: " + diaDaSemana);

        scanner.close();
    }
}
