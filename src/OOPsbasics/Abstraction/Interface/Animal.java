package OOPsbasics.Abstraction.Interface;

public interface Animal {
    void sound(); //abstract method
    void run(); //abstract method
}
class Lion implements Animal{
    public void sound(){ //if public is not used then it become package private so, we have to use public
        System.out.println("Roaring");
    }
    public void run(){
        System.out.println("Running");
    }
}
class ExampleInterface{
    public static void main(String[] args){
        Lion l=new Lion();// here in interfaces we have created object only for child class only not for parent class
        l.sound();
        l.run();
    }
}
