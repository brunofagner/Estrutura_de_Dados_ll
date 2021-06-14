package Lista_2;
import java.util.Scanner;

public class Algoritmo_428 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int dados[][] = new int[10][4],codigo,pos, aux;

    //Com for
    for (int i = 0; i < 10; i++) {
      System.out.println("Digite matricula no formato aascccnnn: ");
      dados[i][0] = input.nextInt();
      aux = (int) (dados[i][0] / 1000000);
      aux = dados[i][0] -aux * 1000000;
      dados[i][2] = (int) aux / 1000;
      System.out.println("Digite o seqsu(0 fem 1 mas):");
      dados[i][1] = input.nextInt(); 
      System.out.println("Digite CR do aluno:");
      dados[i][3] = input.nextInt(); 
    }
    System.out.println("Digite codigo do curso:");
    codigo = input.nextInt();
    pos = 0;
    for (int i = 0; i < 10; i++) {
      if (dados [i][2] == codigo && dados[i][1] == 0) {
        pos = i;
      }else if (dados[i][3] > dados[pos][3]) {
        pos = i;
      }
    }
    System.out.println("Aluna premiada matricula: "+ dados[pos][0] + " teve CR:"+
    dados[pos][3]);

    //Com while
    int i = 0;
    while (i < 10) {
      System.out.println("Digite matricula no formato aascccnnn: ");
      dados[i][0] = input.nextInt();
      aux = (int) (dados[i][0] / 1000000);
      aux = dados[i][0] -aux * 1000000;
      dados[i][2] = (int) aux / 1000;
      System.out.println("Digite o seqsu(0 fem 1 mas):");
      dados[i][1] = input.nextInt(); 
      System.out.println("Digite CR do aluno:");
      dados[i][3] = input.nextInt(); 
      i++;
    }
    System.out.println("Digite codigo do curso:");
    codigo = input.nextInt();
    pos = 0;
    i = 0;
    while (i < 10) {
      if (dados [i][2] == codigo && dados[i][1] == 0) {
        pos = i;
      }else if (dados[i][3] > dados[pos][3]) {
        pos = i;
      }
    }
    System.out.println("Aluna premiada matricula: "+ dados[pos][0] + " teve CR:"+
    dados[pos][3]);

    //Com do while
    i = 0;
    do {
      System.out.println("Digite matricula no formato aascccnnn: ");
      dados[i][0] = input.nextInt();
      aux = (int) (dados[i][0] / 1000000);
      aux = dados[i][0] -aux * 1000000;
      dados[i][2] = (int) aux / 1000;
      System.out.println("Digite o seqsu(0 fem 1 mas):");
      dados[i][1] = input.nextInt(); 
      System.out.println("Digite CR do aluno:");
      dados[i][3] = input.nextInt(); 
      i++;
    }while (i < 10);
    System.out.println("Digite codigo do curso:");
    codigo = input.nextInt();
    pos = 0;
    i = 0;
    do {
      if (dados [i][2] == codigo && dados[i][1] == 0) {
        pos = i;
      }else if (dados[i][3] > dados[pos][3]) {
        pos = i;
      }
    }while (i < 10);
    System.out.println("Aluna premiada matricula: "+ dados[pos][0] + " teve CR:"+
    dados[pos][3]);

    input.close();
  }
}
