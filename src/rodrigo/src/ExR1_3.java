import java.util.Scanner;

public class ExR1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEscolha o cálculo desejado:");

        System.out.println(); // pulando linha

        System.out.println("1. Área do Retângulo"); // Escolha UM ou OUTRO Área OU Perímetro
        System.out.println("2. Perímetro do Retângulo");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a base do retângulo: ");
            double base = scanner.nextDouble();
            System.out.print("Digite a altura do retângulo: ");
            double altura = scanner.nextDouble();
            double area = base * altura;
            System.out.println("A área é: " + area + " metros");
        } else if (opcao == 2) {
            System.out.print("Digite a base do retângulo: ");
            double base = scanner.nextDouble();
            System.out.print("Digite a altura do retângulo: ");
            double altura = scanner.nextDouble();
            double perimetro = base * 2 + altura * 2;
            System.out.println("O perímetro é: " + perimetro + " metros");
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }
        scanner.close(); // lembrar de sempre fechar o scanner.
    }
}
