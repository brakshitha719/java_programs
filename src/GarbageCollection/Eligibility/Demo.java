package GarbageCollection.Eligibility;

public class Demo {
    public void finalize(){
        System.out.println("Garbage collected!");
    }

    static void main() {
        for(int i=0; i<10000; i++) {
            Demo obj = new Demo();//10000 objects and 10000 times it will run in heap side
            obj = null;
        }
        System.gc();
    }
}
