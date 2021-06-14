package Lista_2;

public class Algoritmo_168 {
  public static void main(String[] args) {
    //Com for
    for (int i = 0; i <= 10; i++) {
      System.out.println(i + "-" + i);
      for (int j = 0; j <= i; j++) {
        System.out.print("    ");
      }
    }
    System.out.println(" ");

    //Com while
    int i = 0, j = 0;
    while(i <= 10) {
      System.out.println(i + "-" + i);
      while(j <= i) {
        System.out.print("    ");
        j++;
      }
      j = 0;
      i++;
    }
    System.out.println("");

    //Com do while
    i = 0; j = 0;
    do{
      System.out.println(i + "-" + i);
      do{
        System.out.print("    ");
        j++;
      }while(j <= i);
      j = 0;
      i++;
    }while(i <= 10);
    System.out.println("");
  }
}
