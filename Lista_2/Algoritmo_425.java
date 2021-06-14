package Lista_2;
import java.util.Scanner;

public class Algoritmo_425 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int qtde[][] = new int[10][3];
    String nome[] = new String[10]; 

    for (int i = 0; i < 10; i++) {
      System.out.println("Digite o nome da ["+(i+1)+"] planta: ");
      nome[i] = input.next();
      System.out.println("Digite quantidade em estoque:");
      qtde[i][0] = input.nextInt();
      System.out.println("Digite quantidade ideal:");
      qtde[i][1] = input.nextInt();
      if (qtde[i][0] <qtde[i][1]) {
        qtde[i][2] = qtde[i][1] - qtde[i][0];
      }else{
        qtde[i][2] = 0;
      }
    }
    System.out.println("Total de compras");
    for (int i = 0; i < 10; i++) {
      System.out.println(nome[i]+" - "+ qtde[i][2]);
    }

    //Com while
    int i = 0;
    while (i < 10) {
      System.out.println("Digite o nome da ["+(i+1)+"] planta: ");
      nome[i] = input.next();
      System.out.println("Digite quantidade em estoque:");
      qtde[i][0] = input.nextInt();
      System.out.println("Digite quantidade ideal:");
      qtde[i][1] = input.nextInt();
      if (qtde[i][0] <qtde[i][1]) {
        qtde[i][2] = qtde[i][1] - qtde[i][0];
      }else{
        qtde[i][2] = 0;
      }
      i++;
    }
    System.out.println("Total de compras");
    i = 0;
    while (i < 10) {
      System.out.println(nome[i]+" - "+ qtde[i][2]);
      i++;
    }

    //Com do while
    i = 0;
    do {
      System.out.println("Digite o nome da ["+(i+1)+"] planta: ");
      nome[i] = input.next();
      System.out.println("Digite quantidade em estoque:");
      qtde[i][0] = input.nextInt();
      System.out.println("Digite quantidade ideal:");
      qtde[i][1] = input.nextInt();
      if (qtde[i][0] <qtde[i][1]) {
        qtde[i][2] = qtde[i][1] - qtde[i][0];
      }else{
        qtde[i][2] = 0;
      }
      i++;
    }while (i < 10);
    System.out.println("Total de compras");
    i = 0;
    do {
      System.out.println(nome[i]+" - "+ qtde[i][2]);
      i++;
    }while (i < 10);
    input.close();
  }
}
