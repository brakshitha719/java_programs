package Exceptions;

public class trycatchExample {
    static void main() {
        int i, j, k = 0;
        i = 10;
        j = 2;
        try {
            k = i / j;
            System.out.println(k);
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        }catch(ArithmeticException e){
            System.out.println("Undefined");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }catch(Exception e){
            System.out.println("Unknown Exception");
        }finally{
            System.out.println("This will be executed no matter what");
        }
        System.out.println("Hello");
    }static{
        System.out.println("Execution Starts");
    }
}

