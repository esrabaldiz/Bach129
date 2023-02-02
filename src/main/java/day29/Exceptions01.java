package day29;

public class Exceptions01 {
    public static void main(String[] args) {
        Object obj=70;
        String str=(String) obj;
        System.out.println(str);//ClassCastException
    }
}
