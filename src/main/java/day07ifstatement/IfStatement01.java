package day07ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char ch=input.next().charAt(0);
        if (ch>='A' && ch<='Z') {
            System.out.println("Buyuk harf ...");
        }
        if (ch>='a' && ch<='z'){
            System.out.println("Kucuk harf ...");
//note kucuk harflerin ascii degerlerin buyuk harflerun ascii degerlerinden buyuktur
        }
        //2.yol
        if (ch>='A'&& ch<='Z'){
            System.out.println("buyuk harf...");
        }else if (ch>='a' && ch<='z'){
            System.out.println("kucuk harf...");
        }else System.out.println("Lutfen gecerli bir karakter giriniz");

    }
}
