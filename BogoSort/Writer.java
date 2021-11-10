import java.io.*;
import java.util.List;
public class Writer {

    void writeDocument(List<Integer> numeros) {
        try {
            File file = new File("dados5ordenado.txt");
            FileWriter writer = new FileWriter(file);
            PrintWriter print = new PrintWriter(writer);
            print.print("[");
            for ( int x = 0; x < numeros.size(); x++) {
                print.print(numeros.get(x)+", ");
            }
            print.print("]");
            print.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}