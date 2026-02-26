package OOPsbasics.Abstraction.Interface.MultipleInheritance;

interface Mom {
    default void cook(){
        System.out.println("Indian");
    }
}
interface Dad{
    default void cook(){
        System.out.println("Chinese");
    }
}
class Daughter implements Mom, Dad{
    @Override //
   public void cook(){
       //System.out.println("Indian");
       Mom.super.cook();
    }
}
class multipleinheritance{
    static void main() {
        Daughter d = new Daughter();
        d.cook();
    }
}


