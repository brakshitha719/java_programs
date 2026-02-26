package OOPsbasics.Abstraction.Interface.UpcastingExample;

public interface Vehicle {
    void start();
}
class Bus implements Vehicle{
    public void start(){
        System.out.println("Bus is starting");
    }
}
class Upcasting{
    public static void main(String[] args){
        Vehicle v=new Bus();
        v.start();
    }
}
