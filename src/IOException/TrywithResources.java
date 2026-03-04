package IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrywithResources {
    static void main() throws Exception {
        String str;
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter something:");
            str = bfr.readLine();
            System.out.println("You Entered: " + str);
        }
    }
}
