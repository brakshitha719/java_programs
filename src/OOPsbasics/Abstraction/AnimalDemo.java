package OOPsbasics.Abstraction;

abstract class AnimalDemo {
    abstract void sound();

   void run() {
        System.out.println("Running");
    }
}

    class Lion extends AnimalDemo {
        void sound() {
            System.out.println("Roars");
        }
    }

    class Cat extends AnimalDemo {
        void sound() {
            System.out.println("Meow");
        }
    }

    class Driver {
        public static void main(String[] args) {
            Lion l = new Lion();
            l.run();
            l.sound();

            Cat c = new Cat();
            c.run();
            c.sound();
        }
    }
