package Strings.StringBufferBuilderFunctions;

public class String_Builder {
    public void Stringappend() { //my own custom function
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before append:" + sb);
        sb.append(" World");
        System.out.println("After append:" + sb);

    }

    public void Stringinsert() { //my own custom function
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before insert:" + sb);
        sb.insert(1, "EEE");
        System.out.println("After insert:" + sb);
    }

    public void Stringreverse() { //my own custom function
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before reverse:" + sb);
        sb.reverse();
        System.out.println("After reverse:" + sb);
    }
}
class ExampleBuilder{
    static void main() {
        String_Builder obj = new String_Builder();
        obj.Stringappend();
        obj.Stringinsert();
        obj.Stringreverse();
    }
}

