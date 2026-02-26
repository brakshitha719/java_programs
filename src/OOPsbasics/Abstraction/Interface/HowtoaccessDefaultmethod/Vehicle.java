package OOPsbasics.Abstraction.Interface.HowtoaccessDefaultmethod;

public interface Vehicle {
    default void stop(){
        System.out.println("Stopped!");
    }
}
class Car implements Vehicle {
    public void cfunction() {
        System.out.println("Car is stopped");
    }
}
class Bike implements Vehicle{
    public void stop(){
        System.out.println("Bike is stopped");
    }
}
class ExampleaccessDefault{
    public static void main(String[] args){
        Car c = new Car();
        c.stop();// 1st way to access default method
        c.cfunction();//extra
        Vehicle v=new Car();//upcasting
        v.stop();//2nd way to access default method

        Bike b=new Bike();//stopped is overridded
        b.stop(); //3rd way to access default method

    }
}
