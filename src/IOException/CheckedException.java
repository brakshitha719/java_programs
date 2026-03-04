package IOException;
import java.io.IOException;

public class CheckedException {
    static void readFile() throws IOException {
        throw new IOException("File not found");
    }

    static void display() throws IOException {
        readFile(); //Exception propagation occurs when we not use throws keyword
    }

    static void main() {
        try {
            display();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
