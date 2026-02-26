package OOPsbasics;

public class Car {
    String BrandName;
    int ManDate;
    String Color;

    public Car(String BrandName,int MDate, String C) {
        this.BrandName = BrandName;
        ManDate = MDate;
        Color = C;
        //BrandName = BName;
        //ManDate = MDate;
        //Color = C;
    }
    void printDetails(){
        System.out.printf("Car BrandName is %s\n",this.BrandName);
        System.out.printf("Car Manufacturing Date is %d\n",ManDate);
        System.out.printf("Car color is %s\n",Color);

    }
    }
    class Object{
    public static void main(String[] args){
        Car c1 = new Car("Audi",2000,"Red");
        Car c2 = new Car("BMW",1995,"Black");
        c1.printDetails();
        c2.printDetails();
        }
    }


