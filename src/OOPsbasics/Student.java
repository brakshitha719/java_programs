package OOPsbasics;

public class Student {
    String Name;
    int USN;
    String Address;

    public Student(String Name, int USN, String Address){
        this.Name = Name;
        this.USN = USN;
        this.Address = Address;
    }
    void PrintDetails(){
        System.out.println("Student Name is \n"+Name);
        System.out.println("Student USN is \n"+USN);
        System.out.println("Student Address is \n"+Address);
    }
}
class Student1{
    public static void main(String[] args) {
        Student s1 = new Student("Shrusti",102,"bagalgunte");
        Student s2 = new Student("Preethi",82,"8th Mile");
        s1.PrintDetails();
        s2.PrintDetails();

    }
}
