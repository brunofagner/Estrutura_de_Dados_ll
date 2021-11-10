import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
      File file =  new File("dados5.txt");
      Writer writer = new Writer();

      
      String dados[] = new String[5];
      List<Integer> numeros = new ArrayList<>();
      
      try {
         Scanner input = new Scanner(file);
         while (input.hasNextLine()) {
            dados = input.nextLine().split(", ");
         }
         for (int i = 0; i < dados.length; i++) {
            numeros.add(Integer.parseInt(dados[i]));
         }

         long inicialtime = System.currentTimeMillis();
         //Bogo sort
         int op = 1;
         while(!IsListSorted(numeros)){
            Collections.shuffle(numeros);
            op++;
         }

         long finaltime = System.currentTimeMillis();
         long duracao = finaltime - inicialtime;
         long milisegundos = (duracao % 1000) / 100;
         long segundos = (duracao / 1000) % 60;
         long minutos = (duracao / 60000) % 60;
         long horas = (duracao / 3600000) % 24;
         String time = String.format("%02d:%02d:%02d:%02d", horas, minutos,
         segundos, milisegundos);

         System.out.println("Demorou: "+ time);
         System.out.println(op + " movimentos");

         writer.writeDocument(numeros);
         input.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }

   private static boolean IsListSorted(List<Integer> numeros) {
      for (int j = 1; j < numeros.size(); j++) {
         if (numeros.get(j) < numeros.get(j-1)) {
            return false;
         }
      }
      return true;
   }
}