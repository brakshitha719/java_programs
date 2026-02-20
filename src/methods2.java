public class methods2 {
    static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        //System.out.println("Sum is " + add(10,20)); or
        String result = String.format("Sum is %d", add(10,20));
        System.out.println(result);
    }
}
