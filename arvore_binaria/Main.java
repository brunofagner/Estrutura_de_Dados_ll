import java.util.ArrayList;
import java.util.Random;

public class Main {
      public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            
            Random rand = new Random();
            ArrayList<Integer> nums = new ArrayList<Integer>();
            for (int i = 0; i < 19; i++) {
                  int valor =  rand.nextInt(101);
                  tree.adicionar(valor);
                  nums.add(valor);
            }
            
            
            System.out.println("Impressão em ordem ou infixa:");
            tree.imprimirEmOrdem(tree.raiz);
            System.out.println("\nImpressão pré-fixa:");
            tree.imprimirPreOrdem(tree.raiz);
            System.out.println("\nImpressão pós-fixa:");
            tree.imprimirPosOrdem(tree.raiz);
            System.out.println("\nImpressão nivel:");
            tree.imprimir_nivel();
            System.out.println();
            for (int i = 0; i < 5; i++) {
                  int indice =  rand.nextInt(nums.size());
                  int valor = nums.get(indice);
                  nums.remove(indice);
                  System.out.println("Removendo "+ valor);
                  tree.deletar(valor);
            }

            System.out.println("Apos remover");
            System.out.println("Impressão em ordem ou infixa:");
            tree.imprimirEmOrdem(tree.raiz);
            System.out.println("\nImpressão pré-fixa:");
            tree.imprimirPreOrdem(tree.raiz);
            System.out.println("\nImpressão pós-fixa:");
            tree.imprimirPosOrdem(tree.raiz);
            System.out.println("\nImpressão nivel:");
            tree.imprimir_nivel();
      }
}
