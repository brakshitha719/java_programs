package Exceptions;

public class Example3 {
      static void agecheck(int age){
        if(age >= 18){
            System.out.println("Eligible - Access Grated");
        } else {
            throw new RuntimeException("Not Eligible - Access Denied");
            }
    }

    static void main() {
        // Example3 o = new Example3();
       // o.agecheck(12);/* if you not use static then like this
        //agecheck(25);
        agecheck(25);
    }
}

