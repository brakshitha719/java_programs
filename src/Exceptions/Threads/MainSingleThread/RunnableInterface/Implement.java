package Exceptions.Threads.MainSingleThread.RunnableInterface;

class MTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is Running" + i);
        }
    }
}
public class Implement{
    static void main() {
        MTask obj = new MTask(); //task
        Thread t1 = new Thread(obj); //thread
        t1.start();

        for(int i=1; i<=5; i++){
            System.out.println("Main thread" + i);
        }
    }
}

