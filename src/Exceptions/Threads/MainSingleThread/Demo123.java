package Exceptions.Threads.MainSingleThread;

public class Demo123 {
    static void main() {

        System.out.println("Main thread started");
        for(int i=0; i<5; i++){
            System.out.println("Main Thread is " + i);
        }
        System.out.println("Main Thread stopped");
    }
}
