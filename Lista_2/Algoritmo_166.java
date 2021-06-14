package Lista_2;

public class Algoritmo_166 {
  public static void main(String[] args) {
    //com for
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.print(i+"-"+j+"  ");
      } 
      System.out.println("");
    }
    int i = 1, j = 1;
    while(i <= 10) {
      while(j <= 10) {
        System.out.print(i+"-"+j+"  ");
        j++;
      } 
      j=1;
      i++;
      System.out.println("");
    }
    i = 1; j = 1;
    do{
      do{
        System.out.print(i+"-"+j+"  ");
        j++;
      }while(j <= 10); 
      j=1;
      i++;
      System.out.println("");
    }while(i <= 10);
  }
}
