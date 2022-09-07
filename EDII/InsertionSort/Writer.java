import java.io.*;
public class Writer {

    void writeDocument(int array[], String nomeArquivo, String nomeAlg, String tempoExecucao, Long comparacoes, Long movimentos) {
        try {
            File file = new File("Sorted/"+nomeArquivo+"Sorted.txt");
            FileWriter writer = new FileWriter(file);
            PrintWriter print = new PrintWriter(writer);
            print.println("Nome do aluno: Bruno Fagner Alves de Carvalho e Costa");
            print.println("Nome do Algoritmo: "+ nomeAlg);
            print.println("Tempo de Execucao: "+ tempoExecucao);
            print.println("Quantidade de comparacoes: "+ comparacoes);
            print.println("Quantidade de Movimentacoes: "+ movimentos);
            print.print("[");
            for ( int x = 0; x < array.length; x++) {
                print.print(array[x]+", ");
            }
            print.print("]");
            print.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}