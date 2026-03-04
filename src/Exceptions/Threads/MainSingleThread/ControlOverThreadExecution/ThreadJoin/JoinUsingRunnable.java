package Exceptions.Threads.MainSingleThread.ControlOverThreadExecution.ThreadJoin;

class MyTask implements Runnable {
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}
public class JoinUsingRunnable {
    static void main() throws InterruptedException {
        MyThread obj1 = new MyThread();
        Thread t11 = new Thread(obj1);

        obj1.start();
        obj1.join();

        System.out.println("Main Thread Finished");
    }
}
