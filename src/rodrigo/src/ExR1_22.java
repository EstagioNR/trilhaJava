//faça uma tabuada do 01 ao 10 



public class ExR1_22 {


  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
          int produto = i * j;
          System.out.println(i + " x " + j + " = " + produto);
      }
      System.out.println();
    
  }
  
}
}