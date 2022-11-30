import java.io.*;
class Writer {

    void writeDocument(int array[], String nomeArquivo, String tempoExecucao) {
        try {
            File file = new File("ordenados/"+nomeArquivo+"Sorted.txt");
            FileWriter writer = new FileWriter(file);
            PrintWriter print = new PrintWriter(writer);
            print.println("Nome do aluno: Bruno Fagner Alves de Carvalho e Costa");
            print.println("Tempo de Execucao: "+ tempoExecucao);
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