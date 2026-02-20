public class swapping {
   static void swap(int a, int b) {
         int temp = a;
         a = b;
         b = temp;
    }

        public static void main(String[] args) {
        int a = 10;
        int b = 20;
            System.out.printf("Before swapping a=%d, b=%d\n", a,b);
            swap(a,b);
            System.out.printf("After Swapping a=%d, b=%d\n", a,b);
        }
}
