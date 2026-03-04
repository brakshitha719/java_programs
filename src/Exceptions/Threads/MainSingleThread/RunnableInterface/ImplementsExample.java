package Exceptions.Threads.MainSingleThread.RunnableInterface;

class MyTask implements Runnable {
    public void run(){
        System.out.println("Thread is Running");
    }
}
public class ImplementsExample{
    static void main() {
        MyTask obj = new MyTask();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();

    }
}
