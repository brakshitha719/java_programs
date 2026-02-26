package OOPsbasics.Abstraction;

abstract class RealisticExample {
    String branch;
    RealisticExample(String branch){
        this.branch = branch;
        System.out.println("Branch is "+branch);
    }
    abstract void calculateInterest();
}
class HDFC extends RealisticExample {
    HDFC(String branch) {
        super(branch);
    }
    void calculateInterest(){
        System.out.println("100% Interest");
    }
}
class BankAddress{
    public static void main(String[] args){
        HDFC obj=new HDFC("Peenya Branch");
        obj.calculateInterest();
    }
}
