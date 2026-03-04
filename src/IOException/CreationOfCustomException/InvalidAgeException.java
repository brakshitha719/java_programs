//package IOException.CreationOfCustomException;
//
//public class InvalidAgeException extends Exception {
//    InvalidAgeException(String msg){
//        super(msg);
//    }
//}
//class OurOwnException {
//    static void age(int age) throws InvalidAgeException {
//        if (age < 18) {
//            throw new InvalidAgeException("Age must be over 18!");
//        }
//        System.out.println("Eligible to vote");
//    }
//
//    public static void main(String[] args) {
//        try {
//            age(14);
//            //}catch(InvalidNumberException e){
//            System.out.println(e.getMessage());
//        }
//    }
////}
