package day24accesmodifierinheritance;

public class Car extends  Vehicle {
    public  int price=12000;
    public Car(){

        System.out.println("Car 1");
    }

    public Car(String make){
        this();
        System.out.println("Car 2: " + make);

    }
}