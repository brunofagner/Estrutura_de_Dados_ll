import java.io.*;
public class Writer {

    void writeDocument(int array[]) {
        try {
            File file = new File("dados500000Sorted.txt");
            FileWriter writer = new FileWriter(file);
            PrintWriter print = new PrintWriter(writer);
            for ( int x = 0; x < array.length; x++) {
                print.println(array[x]);
            }
            print.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}