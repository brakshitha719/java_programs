package Exceptions.Threads.MainSingleThread.ControlOverThreadExecution.ThreadJoin;

class MyThread2 extends Thread {
    Thread other;

    MyThread2(Thread other) {
        this.other = other;
    }

    public void run() {
        try {
            if (other != null) {
                other.join();
            }
        } catch (Exception e) {}
            System.out.println(Thread.currentThread().getName()+"Finished");
        }
    }

public class UsingOther {
    static void main() {
        MyThread2 t1 = new MyThread2(null);
        MyThread2 t2 = new MyThread2(t1);
        t1.start();
        t2.start();
    }
}

