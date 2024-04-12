public class ExR1_1 {
  // Trilha de Aprendizado em Java
  // 1. Variáveis, Tipos de Dados e Operadores:
  // Declarações e Atribuições de Variáveis: Declare variáveis de vários tipos de dados (int, double, char, boolean) e atribua valores a elas. Imprima seus valores no console para verificar.

  public static void main(String[] args) {
      
    // Operações com inteiros
      int a = 10;
      int b = 6;
      int somaInt = a + b;
      System.out.println("A soma de " + a + " e " + b + " é igual a: " + somaInt);
      System.out.println();
      
      // Operações com double
      double c = 10;
      double d = 3;
      double igual = c / d;
      System.out.println("O resultado da divisão de " + c + " por " + d + " é igual a: " + igual);
      System.out.println();
      
      // Operações com float
      float e = 10f;
      float g = 7f;
      float calculo = e / g;
      System.out.println("O resultado da divisão de " + e + " por " + g + " é igual a: " + calculo);
      System.out.println();
      
      
      // Operações com char
      char m = 'a';
      char n = 'b';

      int valorm = (int) m;
      int valorbn = (int) n;
      int somaChar = valorm + valorbn;
      char resultado = (char) somaChar;
      System.out.println("A soma de " + m + " e " + n + " é igual a: " + resultado);
      System.out.println();
      // Declaração de variáveis booleanas e uso
      boolean isTrue = true;
      boolean isFalse = false;
      System.out.println("isTrue é igual a: " + isTrue);
      System.out.println("isFalse é igual a: " + isFalse);
  }
}
