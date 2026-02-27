package Exceptions;

public class Example4Bank {
    static void main() {
        try{
            int balance = 2000;
            int withdraw = 3000;
            if(withdraw > balance){
                throw new ArithmeticException("Insufficient Balance");
            }
            System.out.println("Withdraw Successful");
        }catch(ArithmeticException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
