package IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NormalTry {
    static void main() throws Exception {
        String str;
        BufferedReader bfr = null;
        try {
            bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter something:");
            str = bfr.readLine();
            System.out.println("You Entered: " + str);
        } finally {
            bfr.close();
        }
    }
}
