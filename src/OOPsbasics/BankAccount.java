package OOPsbasics;

public class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount deposited:"+amount);
        System.out.println("Updated balance amount:"+balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn is:"+amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    void displayBalance(){
        System.out.println("Name of the holder:"+accountHolder);
        System.out.println("Current balance:"+balance);
    }
}
class Account{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount("Preethi",5000);
        b1.displayBalance();
        b1.deposit(2000);
        b1.withdraw(1000);
        b1.displayBalance();
    }
}
