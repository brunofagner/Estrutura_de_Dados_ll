package Lista_2;
import java.util.Scanner;

public class Algoritmo_418 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int A[][] = new int[4][4], B[][] = new int[4][4], SOMA[][] = new int[4][4];
    //Com for
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.println("Digite o elemento de A ["+(i+1)+"] ["+(j+1)+"] : ");
        A[i][j] = input.nextInt();
      }
    }
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.println("Digite o elemento de B ["+(i+1)+"] ["+(j+1)+"] : ");
        B[i][j] = input.nextInt();
        SOMA[i][j] = A[i][j] + B[i][j];
      }
    }
    System.out.println("MATRIZ SOMA");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print("  "+SOMA[i][j]);
      }
      System.out.println();
    }

    //Com while
    int i =0, j = 0;
    while (i < 4) {
      while (j < 4) {
        System.out.println("Digite o elemento de A ["+(i+1)+"] ["+(j+1)+"] : ");
        A[i][j] = input.nextInt();
        j++;
      }
      i++;
      j = 0;
    }
    while (i < 4) {
      while (j < 4) {
        System.out.println("Digite o elemento de B ["+(i+1)+"] ["+(j+1)+"] : ");
        B[i][j] = input.nextInt();
        SOMA[i][j] = A[i][j] + B[i][j];
        j++;
      }
      i++;
      j = 0;
    }
    System.out.println("MATRIZ SOMA");
    while (i < 4) {
      while (j < 4) {
        System.out.print("  "+SOMA[i][j]);
        j++;
      }
      System.out.println();
      i++;
      j = 0;
    }

    //Com while
    i =0; j = 0;
    do {
     do {
        System.out.println("Digite o elemento de A ["+(i+1)+"] ["+(j+1)+"] : ");
        A[i][j] = input.nextInt();
        j++;
      }while (j < 4);
      i++;
      j = 0;
    }while (i < 4);
    do {
     do {
        System.out.println("Digite o elemento de B ["+(i+1)+"] ["+(j+1)+"] : ");
        B[i][j] = input.nextInt();
        SOMA[i][j] = A[i][j] + B[i][j];
        j++;
      }while (j < 4);
      i++;
      j = 0;
    }while (i < 4);
    System.out.println("MATRIZ SOMA");
    do {
     do {
        System.out.print("  "+SOMA[i][j]);
        j++;
      } while (j < 4);
      System.out.println();
      i++;
      j = 0;
    }while (i < 4);
    input.close();
  }
}
