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
         //Bublle sort
         int aux;
         int op = 0;
         for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
               if (numeros[i] > numeros[j]) {
                  aux = numeros[j];
                  numeros[j] = numeros[i];
                  numeros[i] = aux;
                  op++;
               }
            }
         }
         long finaltime = System.currentTimeMillis();
         long duracao = finaltime - inicialtime;
         long milisegundos = (duracao % 1000) / 100;
         long segundos = (duracao / 1000) % 60;
         long minutos = (duracao / (1000 * 60)) % 60;
         long horas = (duracao / (1000 * 60 * 60)) % 24;
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