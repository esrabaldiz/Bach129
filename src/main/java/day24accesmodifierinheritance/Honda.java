package day24accesmodifierinheritance;

public class Honda extends  Car {
    public  int price=10000;
    public Honda(){
        this("R8", 2023);
        System.out.println("Honda 1");
    }

    public Honda(String model, int year){
        super("Audi");
        System.out.println("Honda 2: " + model + " - " + year);
    }
}