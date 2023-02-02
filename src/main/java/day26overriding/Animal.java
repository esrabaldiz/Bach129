package day26overriding;
/*
override yaparken paranteze ve isme dokunmaz
 */
public class Animal {
    public void eat(){// Parent'daki override edilmis eat() method'una "Overridden Method" denir
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }

    public Animal create(){
        return new Animal();
    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(int a, int b){
        return a*b;
    }
}
