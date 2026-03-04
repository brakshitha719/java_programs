package Exceptions.Threads.MainSingleThread.WaysofCreatingThreads;

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child thread" + i);
        }
    }
}
public class ExampleDemo2{
    static void main() {
        MyThread1 t2=new MyThread1();
        t2.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread" + i);
        }
    }
}
//it is not necessary that main thread should run first or child thread must run first, Because threads work independently, They do not relay on anybody