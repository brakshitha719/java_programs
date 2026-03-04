package Exceptions.Threads.MainSingleThread.ControlOverThreadExecution.ThreadJoin;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

    public class joinfunction {
        static void main() {
            MyThread t1 = new MyThread();
            t1.start();

            try {
                t1.join();
            } catch (Exception e) {
            }
            System.out.println("Main Thread Finished");
        }
}
//after using join function main thread finished is executed at the last
//otherwise first main function will execute