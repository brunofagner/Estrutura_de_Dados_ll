package Lista_2;
import java.util.Scanner;

public class Algoritmo_412 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N[][] = new int[5][5];
    
    //Com for
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.println("digite o elemento "+ (i+1) +"-"+(j+1));
        N[i][j] = input.nextInt();
      }
    }
    System.out.println("Toda a matriz");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(N[i][j]+" ");
      }
      System.out.println("");
    }
    System.out.println("So os elementos nas posicoes cuja soma resulta num par ");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print(N[i][j]+" ");
        }
        System.out.print(" ");
      }
      System.out.println("");
    }
    //Com while 
    int i = 0, j = 0;
    while(i < 5) {
      while(j < 5) {
        System.out.println("digite o elemento "+ (i+1) +"-"+(j+1));
        N[i][j] = input.nextInt();
        j++;
      }
      j = 0;
      i++;
    }
    i = 0;
    j = 0;
    System.out.println("Toda a matriz");
    while(i < 5) {
      while(j < 5) {
        System.out.print(N[i][j]+" ");
        j++;
      }
      System.out.println("");
      i++;
      j = 0;
    }
    i = 0;
    j = 0;
    System.out.println("So os elementos nas posicoes cuja soma resulta num par ");
    while (i < 5) {
      while (j < 5) {
        if ((i + j) % 2 == 0) {
          System.out.print(N[i][j]+" ");
        }
        System.out.print(" ");
        j++;
      }
      System.out.println("");
      i++;
      j = 0;
    }

    //Com while 
    i = 0; j = 0;
    do {
      do {
        System.out.println("digite o elemento "+ (i+1) +"-"+(j+1));
        N[i][j] = input.nextInt();
        j++;
      }while(j < 5);
      i++;
      j = 0;
    }while(i < 5);
    i = 0;
    j = 0;
    System.out.println("Toda a matriz");
    do {
      do {
        System.out.print(N[i][j]+" ");
        j++;
      }while(j < 5);
      System.out.println("");
      i++;
      j = 0;
    }while(i < 5);
    i = 0;
    j = 0;
    System.out.println("So os elementos nas posicoes cuja soma resulta num par ");
    do {
      do {
        if ((i + j) % 2 == 0) {
          System.out.print(N[i][j]+" ");
        }
        System.out.print(" ");
        j++;
      }while(j < 5);
      System.out.println("");
      i++;
      j = 0;
    }while(i < 5);
    input.close();
  }
}
