import java.util.Scanner;
public class Studentgradesystem {
    public static void main(String[] args) {
        int a,b,c,d,e,sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("........Student Grading System...........");
        System.out.println("Enter Subject 1 marks:" );
        a=sc.nextInt();
        System.out.println("Enter Subject 2 marks:" );
        b=sc.nextInt();
        System.out.println("Enter Subject 3 marks:" );
        c=sc.nextInt();
        System.out.println("Enter Subject 4 marks:" );
        d=sc.nextInt();
        System.out.println("Enter Subject 5 marks:" );
        e=sc.nextInt();
        sum= a+b+c+d+e;
        System.out.println("Total marks=" +sum);
        int percentage = (sum/500) * 100;
        if(percentage>=75) {
            System.out.println("Grade A");
        }
        else if(percentage>=50 & percentage<75) {
            System.out.println("Grade B");
        }
        else if(percentage>=30 & percentage<50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
        System.out.println(" Total Percentage:" +percentage);
                    }
}

