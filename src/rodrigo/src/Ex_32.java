import java.util.Scanner;

public class Ex_32 {
    public static void main(String[] args) {

        String[] frutas = {"pera", "uva", "morango", "pessego", "abacate",};
        double[] valores = {2.50, 3.00, 4.00, 3.50, 2.00};
        
        // Solicitar ao usuário que insira uma fruta
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de uma fruta: ");
        String frutaDigitada = scanner.nextLine();
        
        // Procurar a fruta no array
        boolean encontrou = false;
        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].equalsIgnoreCase(frutaDigitada)) {
                System.out.println("A fruta " + frutaDigitada + " custa R$" + valores[i]);
                encontrou = true;
                break;
            }
        }
        
        // Se a fruta não for encontrada, exibir uma mensagem
        if (!encontrou) {
            System.out.println("Desculpe, a fruta " + frutaDigitada + " não está disponível.");
        }
        
        // Fechar o scanner
        scanner.close();
    }
}
