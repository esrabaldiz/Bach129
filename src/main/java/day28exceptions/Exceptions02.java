package day28exceptions;

public class Exceptions02 {
    public static void main(String[] args) {

        String s = "1234";
        convertStringToint(s);
        String t = "1a2b";
        convertStringToint(t);
    }
    // icinde rakamlar disinda bir karakter olan stringi sayiya cevirmek istersek java "number format exception" atar.

    public static void convertStringToint(String s) {
        int intS =0;
        try {

           intS = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("bir stringin sayiya donusturulebilmesi icin rakam disi karakter icermemesi gerekir");
            //teknik mesaj
            System.out.println(e.getMessage());//bununla javanin teknik mesajini almis oluruz
        }

        System.out.println(intS + 1);
    }
}