import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            String nomesArquivo[] = {"dados5", "dados100", "dados1000", "dados10_mil", "dados50_mil","dados100_milMelhor", "dados100_mil",
                        "dados100_milPior", "dados500_mil"};
            int tamanhoArquivo[] = { 5, 100, 1000, 10000, 50000, 100000, 100000, 100000, 500000 };
            for (int i = 0; i < tamanhoArquivo.length; i++) {
                  File file = new File("dados/" + nomesArquivo[i] + ".txt");

                  SelectionSort selectionSort = new SelectionSort();

                  Writer writer = new Writer();

                  String n[] = new String[tamanhoArquivo[i]];
                  int nInteger[] = new int[tamanhoArquivo[i]];

                  try {
                        Scanner scan = new Scanner(file);
                        while (scan.hasNextLine()) {
                              n = scan.nextLine().split(", ");
                        }

                        for (int a = 0; a < n.length; a++) {
                              nInteger[a] = Integer.parseInt(n[a]);
                        }



                        long comeco = System.currentTimeMillis();
                        int sortedSelection[] = selectionSort.sort(nInteger);
                        long fim = System.currentTimeMillis();

                        long duracao = fim - comeco;
                        long milisegundos = (duracao % 1000) / 100;
                        long segundos = (duracao / 1000) % 60;
                        long minutos = (duracao / (1000 * 60)) % 60;
                        long horas = (duracao / (1000 * 60 * 60)) % 24;

                        String tempo = String.format("%02d:%02d:%02d:%02d", horas, minutos, segundos, milisegundos);
                        System.out.println("Tempo para "+tamanhoArquivo[i]);
                        System.out.println(tempo);

                        writer.writeDocument(sortedSelection, nomesArquivo[i], "Selection Sort", tempo, selectionSort.contOp,
                                    selectionSort.contMov);

                        scan.close();
                  } catch (FileNotFoundException e) {
                        e.printStackTrace();
                  }
            }
      }
}