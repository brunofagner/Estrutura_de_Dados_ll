import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      File file = new File("dados500_mil.txt");

      //InsertionSort insertSort = new InsertionSort();
      SelectionSort selectionSort = new SelectionSort();

      Writer writer = new Writer();

      String i[] = new String[500000];
      int iInteger[] = new int[500000];

      try {
         Scanner scan = new Scanner(file);
         while (scan.hasNextLine()) {
            i = scan.nextLine().split(", ");
         }

         for (int a = 0; a < i.length; a++) {
            iInteger[a] = Integer.parseInt(i[a]);
         }

         // long comeco = System.currentTimeMillis();
         // int sortedInsert[] = insertSort.sort(iInteger);
         // long fim = System.currentTimeMillis();

         long comeco = System.currentTimeMillis();
         int sortedSelection[] = selectionSort.sort(iInteger);
         long fim = System.currentTimeMillis();

         long duracao = fim - comeco;
         long milisegundos = (duracao % 1000) / 100;
         long segundos = (duracao / 1000) % 60;
         long minutos = (duracao / (1000 * 60)) % 60;
         long horas = (duracao / (1000 * 60 * 60)) % 24;

         String tempo = String.format("%02d:%02d:%02d:%02d", horas, minutos, segundos, milisegundos);

         System.out.println(tempo);
         System.out.println(selectionSort.contOp);
         //System.out.println(insertSort.contOp);

         writer.writeDocument(sortedSelection);
         //writer.writeDocument(sortedInsert);

         scan.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }
}