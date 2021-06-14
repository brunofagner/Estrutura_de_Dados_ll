package Lista_2;
import java.util.Scanner;

public class Algoritmo_404 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int  N[][] = new int[10][10];
    
    //Com for
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.println("Entre com elemento linha: "+(i+1)+"coluna "+ (j+1));
        N[i][j] = input.nextInt();
      }
    }
    System.out.println("<<=====Acima da diagonal principal=====>");
    for (int i = 0; i < 8; i++) {
      for (int j = i+1; j <= 9; j++) {
        System.out.print(" " + N[i][j]);
      }
      System.out.println("");
      for (int h = 0; h <= i; h++) {
      System.out.print(" ");  
      }
    }

    //Com while
    int i = 0, j = 0;
    while(i < 9) {
      while (j < 9) {
        System.out.println("Entre com elemento linha: "+(i+1)+"coluna "+ (j+1));
        N[i][j] = input.nextInt();
        j++;
      }
      i++;
      j = 0;
    }
    i = 0;
    j = 0;
    int h = 0;
    System.out.println("<<=====Acima da diagonal principal=====>");
    while (i < 8) {
      j = i+1;
      while (j <= 9) {
        System.out.print(" " + N[i][j]);
        j++;
      }
      System.out.println(""); 
      while (h <= i) {
        System.out.print(" ");
        h++;  
      }
      j = 0;
      i++;
    }

    //Com do while
    i = 0; j = 0;
    do {
      do {
        System.out.println("Entre com elemento linha: "+(i+1)+"coluna "+ (j+1));
        N[i][j] = input.nextInt();
        j++;
      }while (j < 9);
      i++;
      j = 0;
    }while(i < 9);
    i = 0;
    j = 0;
    h = 0;
    System.out.println("<<=====Acima da diagonal principal=====>");
    do {
      j = i+1;
      do {
        System.out.print(" " + N[i][j]);
        j++;
      }while (j <= 9);
      System.out.println(""); 
      do{
        System.out.print(" ");
        h++;  
      }while (h <= i);
      j = 0;
      i++;
    }while (i < 8);
    input.close();
  }
}
