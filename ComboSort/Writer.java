import java.io.*;
public class Writer {

    void writeDocument(int array[]) {
        try {
            File file = new File("dados500000ordenado.txt");
            FileWriter writer = new FileWriter(file);
            PrintWriter print = new PrintWriter(writer);
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