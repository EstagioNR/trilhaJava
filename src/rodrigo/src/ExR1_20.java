// Sequência de Fibonacci: Gere a sequência de Fibonacci até um certo limite
//usando um loop for ou while. A sequência de Fibonacci começa com 0 e 1, e cada número subsequente é a soma dos dois anteriores.
public class ExR1_20 {

  public static void main(String[] args) {
    int n = 10;
    int primeiroTermo = 0;
    int segundoTermo = 1;

    System.out.println("sequencia de fibonacci");
    System.out.println(primeiroTermo);
    System.out.println(segundoTermo);

    for (int i = 2; i < n; i++) {
      int proximoTermo = primeiroTermo + segundoTermo;
      System.out.println(proximoTermo);
      primeiroTermo = segundoTermo;
      segundoTermo = proximoTermo;
    }
  }
  
}
