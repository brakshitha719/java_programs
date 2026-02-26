package OOPsbasics.Encapsulation;

public class Student {
    private String name;
    private int USN;

    Student(String name, int USN) {
        this.name = name;
        this.USN = USN;
    }


    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }


    void Print(){
        System.out.println("Student name:"+this.name);
        System.out.println("Student usn:"+this.USN);
    }
}
class Driver12{
    public static void main(String[] args) {
       Student s1 = new Student("Shrusti",102);
       s1.Print();
       System.out.println("name is:" + s1.getName());
        s1.setName("Preethi");
        s1.Print();
       System.out.println("USN is:"+ s1.getName());
    }
}
