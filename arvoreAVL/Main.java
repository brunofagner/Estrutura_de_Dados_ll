// import java.util.Scanner;

// import java.io.File;
// import java.io.FileNotFoundException;

// public class Main {
//       public static void main(String[] args) {
//             String nomesArquivo[] = { "dados5", "dados100", "dados1000", "dados10_mil", "dados50_mil",
//                         "dados100_milMelhor", "dados100_mil",
//                         "dados100_milPior", "dados500_mil" }, nomeAlg;
//             int tamanhoArquivo[] = { 5, 100, 1000, 10000, 50000, 100000, 100000, 100000, 500000 };
//             Scanner input = new Scanner(System.in);
//             Writer writer = new Writer();

//             while (true) {
//                   System.out.println("Qual vai ser a de hoje chefe?");
//                   System.out.println("1-InsertionSort!");
//                   System.out.println("2-SelectionSort!");
//                   System.out.println("3-BubbleSort!");
//                   System.out.println("4-ComboSort!");
//                   System.out.println("5-BogoSort!");
//                   System.out.println("6-ShellSort!");
//                   System.out.println("7-QuickSort!");
//                   System.out.println("8-MergeSort!");
//                   System.out.println("9-HeapSort!");
//                   System.out.println("10-GnomeSort!");
//                   System.out.println("11-RadixSort!");
//                   System.out.println("12-CountingSort!");
//                   System.out.println("13-BucketSort!");
//                   System.out.println("14-CocktailSort!");
//                   System.out.println("15-TimSort!");
//                   System.out.println("16-Sair!");
//                   int algoritmo = input.nextInt();
//                   if (algoritmo > 15) {
//                         break;
                        
//                   }
//                   for (int i = 0; i < tamanhoArquivo.length; i++) {

//                         File file = new File("dados/" + nomesArquivo[i] + ".txt");
//                         String n[] = new String[tamanhoArquivo[i]];
//                         int nInteger[] = new int[tamanhoArquivo[i]];
//                         long comeco, fim;
//                         int sorted[];
//                         Ordenador ordenador;
//                         try {
//                               Scanner scan = new Scanner(file);
//                               while (scan.hasNextLine()) {
//                                     n = scan.nextLine().split(", ");
//                               }
//                               for (int a = 0; a < n.length; a++) {
//                                     nInteger[a] = Integer.parseInt(n[a]);
//                               }

//                               if (algoritmo == 1) {
//                                     ordenador = new InsertionSort();
//                                     nomeAlg = "InsertionSort";

//                               } else if (algoritmo == 2) {
//                                     ordenador = new SelectionSort();
//                                     nomeAlg = "SelectionSort";

//                               } else if (algoritmo == 3) {
//                                     ordenador = new BubbleSort();
//                                     nomeAlg = "BubbleSort";
//                               }else if (algoritmo == 4) {
//                                     ordenador = new ComboSort();
//                                     nomeAlg = "ComboSort";
//                               }else if (algoritmo == 5) {
//                                     ordenador = new BogoSort();
//                                     nomeAlg = "BogoSort";
//                               }else if (algoritmo == 6) {
//                                     ordenador = new ShellSort();
//                                     nomeAlg = "ShellSort";
//                               }else if (algoritmo == 7) {
//                                     ordenador = new QuickSort();
//                                     nomeAlg = "QuickSort";
//                               }else if (algoritmo == 8) {
//                                     ordenador = new MergeSort();
//                                     nomeAlg = "MergeSort";
//                               }else if (algoritmo == 9) {
//                                     ordenador = new HeapSort();
//                                     nomeAlg = "HeapSort";
//                               }else if (algoritmo == 10) {
//                                     ordenador = new GnomeSort();
//                                     nomeAlg = "GnomeSort";
//                               } else if (algoritmo == 11) {
//                                     ordenador = new RadixSort();
//                                     nomeAlg = "RadixSort";
//                               } else if (algoritmo == 12) {
//                                     ordenador = new CountingSort();
//                                     nomeAlg = "CountingSort";
//                               }else if (algoritmo == 13) {
//                                     ordenador = new BucketSort();
//                                     nomeAlg = "BucketSort";
//                               }else if (algoritmo == 14) {
//                                     ordenador = new CocktailSort();
//                                     nomeAlg = "CocktailSort";
//                               }else if (algoritmo == 15) {
//                                     ordenador = new TimSort();
//                                     nomeAlg = "TimSort";
//                               } else {
//                                     break;
//                               }

//                               comeco = System.currentTimeMillis();
//                               sorted = ordenador.sort(nInteger);
//                               fim = System.currentTimeMillis();


//                               long duracao = fim - comeco;
//                               long milisegundos = (duracao % 1000) / 100;
//                               long segundos = (duracao / 1000) % 60;
//                               long minutos = (duracao / (1000 * 60)) % 60;
//                               long horas = (duracao / (1000 * 60 * 60)) % 24;

//                               String tempo = String.format("%02d:%02d:%02d:%02d", horas, minutos, segundos,
//                                           milisegundos);
//                               System.out.println("Tempo para " + tamanhoArquivo[i]);
//                               System.out.println(tempo);

//                               writer.writeDocument(sorted, nomesArquivo[i], nomeAlg, tempo, ordenador.contComp, ordenador.contMov);
//                               if (algoritmo == 5) {
//                                     break;
//                               }
                              
//                         } catch (FileNotFoundException e) {
//                               e.printStackTrace();
//                         }
//                   }
//             }
//       }
// }
