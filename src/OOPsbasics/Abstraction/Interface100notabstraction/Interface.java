 package OOPsbasics.Abstraction.Interface100notabstraction;

public interface Interface {
    void In(); //abstract method
    default void Info(){ //because this reason java is not 100 abstraction//
        System.out.println("Information");
    }
    static void show(){
        System.out.println("Showing");
    }
}
class Examplenot100 implements Interface{
    public void In() {
        System.out.println("IN");
    }
}
class not100{
    public static void main(String[] args){
        Interface.show();
        Examplenot100 e = new Examplenot100();
        e.In();
        e.Info();

    }
}
