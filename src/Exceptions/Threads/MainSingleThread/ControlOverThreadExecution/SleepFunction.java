package Exceptions.Threads.MainSingleThread.ControlOverThreadExecution;

class MyThread1 extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("child: " + i);
            try{
                Thread.sleep(10000);
            }catch(Exception e){}
        }
    }
}
public class SleepFunction{
    static void main() {
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
