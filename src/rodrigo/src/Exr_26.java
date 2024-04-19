public class Exr_26 {

    public static void main(String[] args) {
        String original = "hallo";
        String invertida = InversorDeString.inverterString(original);

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}

class InversorDeString {
    public static String inverterString(String str) {
        // Inicializamos uma string vazia para armazenar a string invertida
        String inversa = "";

        // Iteramos pela string original de trás para frente
        for (int i = str.length() - 1; i >= 0; i--) {
            // Adicionamos cada caractere à string invertida
            inversa += str.charAt(i);
        }

        // Retornamos a string invertida
        return inversa;
    }
}
