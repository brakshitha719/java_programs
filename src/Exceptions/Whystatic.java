package Exceptions;

public class Whystatic {
    static void main() {

    }
    //static always executes first
    static {
        try {
            System.out.println(" ");
        } catch(Exception e) {
            System.out.println("Example");
        }
    }
}