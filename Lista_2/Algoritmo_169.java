package Lista_2;

public class Algoritmo_169 {
  public static void main(String[] args) {

    //Com for
    for (int i = 2; i <= 10; i++) {
      System.out.println("");
      for (int j = 1; j < i; j++) {
        System.out.print(i + "-" + j+"  ");
      }  
    }
    System.out.println("");

    //Com while
    int i = 2, j = 1;
    while (i <= 10) {
      System.out.println("");
      while (j < i) {
        System.out.print(i + "-" + j+"  ");
        j++;
      }  
      j = 1;
      i++;
    }
    System.out.println("");

    //Com do while
    i = 2; j = 1;
    do{
      System.out.println("");
      do {
        System.out.print(i + "-" + j+"  ");
        j++;
      }while (j < i);  
      j = 1;
      i++;
    }while (i <= 10);
    System.out.println("");    
  }
}
