import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {
      public static void main(String[] args) {
            File file = new File("dados/dados100_mil.txt");
            String n[] = new String[100000];
            int nInteger[] = new int[100000];
            long comeco, fim;

            try {
                  Scanner scan = new Scanner(file);
                  while (scan.hasNextLine()) {
                        n = scan.nextLine().split(", ");
                  }
                  for (int a = 0; a < n.length; a++) {
                        nInteger[a] = Integer.parseInt(n[a]);
                  }

                  comeco = System.currentTimeMillis();
                  // arvore avl
                  ArvoreAvl arvoreAvl = new ArvoreAvl();
                  for (int num : nInteger) {
                        arvoreAvl.inserir(num);
                  }
                  System.out.println();
                  System.out.println("Arvore Avl");
                  System.out.println("--------------------------");
                  System.out.println("Em ordem");
                  arvoreAvl.imprmirEmOrdem(arvoreAvl.raiz);
                  System.out.println("Pre Ordem");
                  arvoreAvl.imprimirPreOrdem(arvoreAvl.raiz);
                  System.out.println("Pos Ordem");
                  arvoreAvl.imprimirPosOrdem(arvoreAvl.raiz);

                  fim = System.currentTimeMillis();
                  long duracao = fim - comeco;
                  long milisegundos = (duracao % 1000) / 100;
                  long segundos = (duracao / 1000) % 60;
                  long minutos = (duracao / (1000 * 60)) % 60;
                  long horas = (duracao / (1000 * 60 * 60)) % 24;

                  String tempoAvl = String.format("%02d:%02d:%02d:%02d", horas, minutos, segundos,
                              milisegundos);

                  //-------------------------------------------------

                  comeco = System.currentTimeMillis();
                  // arvore avl
                  BinaryTree arvoreBinaria = new BinaryTree();
                  for (int num : nInteger) {
                        arvoreBinaria.adicionar(num);
                  }
                  System.out.println();
                  System.out.println("Arvore Binaria");
                  System.out.println("--------------------------");
                  System.out.println("Em ordem");
                  arvoreBinaria.imprimirEmOrdem(arvoreBinaria.raiz);
                  System.out.println("Pre Ordem");
                  arvoreBinaria.imprimirPreOrdem(arvoreBinaria.raiz);
                  System.out.println("Pos Ordem");
                  arvoreBinaria.imprimirPosOrdem(arvoreBinaria.raiz);

                  fim = System.currentTimeMillis();
                  duracao = fim - comeco;
                  milisegundos = (duracao % 1000) / 100;
                  segundos = (duracao / 1000) % 60;
                  minutos = (duracao / (1000 * 60)) % 60;
                  horas = (duracao / (1000 * 60 * 60)) % 24;
                  System.out.println();
                  System.out.println("Tempo para Arvore Binaria");
                  String tempoBinaria = String.format("%02d:%02d:%02d:%02d", horas, minutos, segundos,
                              milisegundos);
                  System.out.println(tempoBinaria);
                  System.out.println("Tempo para Arvore AVL");
                  System.out.println(tempoAvl);
            } catch (FileNotFoundException e) {
                  e.printStackTrace();
            }
      }
}
