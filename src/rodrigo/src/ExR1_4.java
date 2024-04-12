public class ExR1_4 {

/*Troca de Variáveis: Escreva código para trocar os valores de duas variáveis
 * sem usar uma terceira variável temporária. Implemente isso usando operações aritméticas.*/
 
public static void main(String[] args) {

        double x = 3.2;
        double y = 60;
        
        System.out.println("Antes da troca:");
        System.out.println("x = " + x);
        System.out.println("y = " + y); 
        
        x = x + y;
        y = x - y;
        x = x - y;
        
        System.out.println("\nDepois da troca:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
      }

  
   }
