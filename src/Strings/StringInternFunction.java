package Strings;

public class StringInternFunction {
    static void main() {
        String s1=new String("Hello"); //Hello
        String s2="Hello";

        String s3=s1.intern(); //Hello
        System.out.println(s1==s3);//false
        System.out.println(s2==s3);//true
        System.out.println(s3);
        System.out.println(s1);//Hello
    }
}
