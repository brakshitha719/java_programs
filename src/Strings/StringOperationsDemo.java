package Strings;

public class StringOperationsDemo {
    static void main() {
        //creating the string
        String s1="Java Programming";
        String s2=new String("Java Programming");

        //length()
        System.out.println("1.Length function:" + s1.length());

        //charAt()
        System.out.println("2.Character at particular index" + s1.charAt(2));

        //toUppercase() and toLowercase()
        System.out.println("3.Uppercase:" + s1.toUpperCase());
        System.out.println("Lowercase:" + s1.toLowerCase());

        //equals() and ==
        System.out.println("4.Using equals function:" + s1.equals(s2));
        System.out.println("Using == function:" + (s1==s2));

        //compareTo()
        System.out.println("5.Comarision function:"+s1.compareTo(s2));

        //substring()
        System.out.println("6.Substring:" + s1.substring(0,4));

        //contains()
        System.out.println("7.Contains function:" + s1.contains("Java"));

        //IndexOf()
        System.out.println("8.Index of the character:" + s1.indexOf('P'));

        //repalce()
        System.out.println("9.Before Replace:"+s1);
        System.out.println("After Replace:" + s1.replace("Java","Python"));

        //startswith() and endswith()
        System.out.println("10.Starting with:" + s1.startsWith("Java"));
        System.out.println("Ending with:" + s1.endsWith("mming"));

        //trim()
        String str="     rakshi   ";
        System.out.println("11.Before Trim"+str);
        System.out.println("Using trim function:" + str.trim());

        //concat()
        System.out.println("12.Concatenation function:" + s1.concat(" Language"));

        //split()
        String s = "Java is a Programming Language";
        String[] arr = s.split(" ");
        System.out.println("13.After split:");
        for(String i:arr){
            System.out.println(i);
        }

        //isEmpty()
        String str1 = "";
        System.out.println("14.isEmpty?:" +str1.isEmpty());


    }
}
