package OOPsbasics.CopyConstructor;

public class Student {
    String Name;
    int USN;

    //Traditional constructor
    Student(String Name,int USN){
        this.Name = Name;
        this.USN = USN;
    }

    //copy constructor
    Student(Student obj){
        this.Name = obj.Name;
        this.USN = obj.USN;
    }
    void display(){
        System.out.println(Name + " " + USN);
    }
}
class Driver1{
    static void main() {
        Student s1 = new Student("Preethi",82);
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}


