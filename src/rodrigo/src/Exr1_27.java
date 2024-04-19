public class Exr1_27 {
    public static int encontrar(int[] array, int alvo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == alvo) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int alvo = 30;
        int resultado = encontrar(array, alvo);

        if (resultado != -1) {
            System.out.println("O valor alvo está presente no índice: " + resultado);
        } else {
            System.out.println("O valor alvo não está presente no array.");
        }
    }
}
