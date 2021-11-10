import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
      File file =  new File("dados500000.txt");
      Writer writer = new Writer();

      String dados[] = new String[500000];
      int numeros[] = new int[500000];
      
      try {
         Scanner input = new Scanner(file);
         while (input.hasNextLine()) {
            dados = input.nextLine().split(", ");
         }
         for (int i = 0; i < dados.length; i++) {
            numeros[i] = Integer.parseInt(dados[i]);
         }

         long inicialtime = System.currentTimeMillis();
         //Combo sort
         int op = 0;
         int gap = numeros.length;
         boolean swapped = true;
         while (gap > 1 || swapped) {
            if (gap > 1){
                 gap = (int) (gap / 2);//1, 1.3, 2
            }
            int i = 0;
            swapped = false;
            while (i + gap < numeros.length) {
               if (numeros[i] > numeros[i + gap]) {
                  int aux = numeros[i];
                  numeros[i] = numeros[i + gap];
                  numeros[i + gap] = aux;
                  swapped = true;
                  op++;
               }
               i++;
            }
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
}