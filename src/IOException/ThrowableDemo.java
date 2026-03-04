package IOException;

public class ThrowableDemo {
    static void function() throws Throwable{
        throw new Throwable("Something went wrong");
    }

    static void main() {
        try{
            function();
        }catch(Throwable t){
            System.out.println(t.getMessage());
        }
    }
}
/*
Allowed:
throw new Exception("Message")
throw new RuntimeException("Message")
throw new Throwable("Message")

Not Allowed: X
throw new string: X
 */