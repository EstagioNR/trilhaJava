//                2. Estruturas Condicionais:
// Faça uma calculadora





import java.util.Scanner;

public class ExR1_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir os dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicita ao usuário para selecionar a operação
        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double resultado = 0;

        scanner.close();
        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
               
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return; 
                }
                break;
            default:
                System.out.println("Opção inválida.");
                return; 
                
        }
       
        
        System.out.println("O resultado da operação é: " + resultado);
        
        
       
    }
}
