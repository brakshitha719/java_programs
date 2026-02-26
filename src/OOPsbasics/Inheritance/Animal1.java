//package OOPsbasics.Inheritance;

import org.w3c.dom.ls.LSOutput;

//multi-level inheritance
public class Animal1 {
    public class Animal {
        void eat(){
            System.out.println("Eating.....");
        }
        class Lion extends OOPsbasics.Inheritance.Animal {
            void roar(){
                System.out.println("Roaring.......");
            }
        }
        class BabyLion{
        }
        }
    }
