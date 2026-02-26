package OOPsbasics.Abstraction;

abstract class AnimalDemoConstructor {
    AnimalDemoConstructor(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();

}
class Dog1 extends AnimalDemoConstructor{
    Dog1(){
        System.out.println(" Dog Constructor");
    }
    void sound(){
        System.out.println("Barking");
    }
}
class Constructor{
    public static void main(String[] args){
        Dog1 d =new Dog1();
        d.sound();
    }
}
