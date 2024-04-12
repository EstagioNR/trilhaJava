//Geração de Números Aleatórios: Gere um número aleatório dentro de um intervalo especificado
// (por exemplo, entre 1 e 100) usando o método Math.random().




public class ExR1_7 {
 public static void main(String[] args) {
  
  int min = 1;
  int max = 100;

  
  int numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;


  System.out.println("\n Número aleatório dentro do intervalo [" + min + ", " + max + "]: " + numeroAleatorio);
   
   }
  
 } 









