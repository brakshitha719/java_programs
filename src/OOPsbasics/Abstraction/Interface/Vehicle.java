package OOPsbasics.Abstraction.Interface;
//example for default Keyword
public interface Vehicle {
    void start();
     default void stop(){
         System.out.println("Vehicle is stopping");
     }
}
class Audi implements Vehicle {
    public void start() {
        System.out.println("Audi is starting");
    }
}
class BMW implements Vehicle {
    public void start() {
        System.out.println("BMW is starting");
    }
}
class Shift implements Vehicle {
    public void start() {
        System.out.println("Shift is starting");
    }
}
class Exampledefault{
    public static void main(String[] args){
        Audi a=new Audi();
        a.start();
        a.stop();

        BMW b=new BMW();
        b.start();
        b.stop();
    }
}



