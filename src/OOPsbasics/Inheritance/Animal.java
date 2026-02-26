package OOPsbasics.Inheritance;

//single-level inheritance

public class Animal {
    void eat(){
        System.out.println("Eating.....");
    }
    class Lion extends Animal{
        void roar(){
            System.out.println("Roaring.......");
        }
    }
    class Driver2{
        static void main() {
            Animal a = new Animal();
            a.eat();
        }
    }
}
