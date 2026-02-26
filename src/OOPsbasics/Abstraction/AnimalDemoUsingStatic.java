package OOPsbasics.Abstraction;

abstract class AnimalDemoUsingStatic {
    static void Info(){
        System.out.println("Animals are living beings");
    }
    abstract void sound();
}
class Dog extends AnimalDemoUsingStatic {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Example{
    public static void main(String[] args){
        AnimalDemoUsingStatic.Info();
        Dog d = new Dog();
        d.sound();
    }
}
