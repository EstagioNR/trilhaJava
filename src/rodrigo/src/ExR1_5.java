// inteiro é par  ou ímpar. Utilize o operador módulo (%) para
//determinar a divisibilidade por 2. 

 import java.util.Scanner;  // abertura para receber entrada do operador
 public class ExR1_5{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("\n digite um numero inteiro: ");
    int numero = scanner.nextInt();

    if (numero % 2 == 0){  //  condiçaõ se if  welse se não

      System.out.println(numero + "e um numero par");
    } 
    else{
      System.out.println(numero + "e um numero impar ");
    }
    

    // % utilizado como modulo restante de um calculo para mostrar oque se sobrou 
  
    scanner.close(); // fechamento do scaner não esquecer 
    }
}

