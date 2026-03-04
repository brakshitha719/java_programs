package IOException.CreationOfCustomException;

public class InvalidNumberException extends Exception {
    InvalidNumberException(String msg){
        super(msg);
    }
}
class MyOwnException{
    static void Number(int Number) throws InvalidNumberException{
        if(Number>0){
            throw new InvalidNumberException("The number is Positive");
        }
        System.out.println("The number is Negative");
    }
    public static void main(String[] args){
        try{
            Number(5);
        }catch(InvalidNumberException e){
            System.out.println(e.getMessage());
        }
    }
}