package Exceptions.Threads.MainSingleThread.WaysofCreatingThreads;

 class MyThread extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
}
public class ExampleDemo1{
    static void main() {
        MyThread t1=new MyThread();
        t1.start();
        //System.out.println("Main thread is running");
    }
}
