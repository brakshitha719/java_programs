package IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;


public class ScannerVsBufferedReaderExample {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(str); //NumberFormatException occurs = because i given hii as an input we have to give numbers (1) as an input

    //execute and see to know the difference press enter

    //Scanner sc = new Scanner(System.in);
  //  String str = sc.next();

}
}