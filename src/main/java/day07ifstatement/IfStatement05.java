package day07ifstatement;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
        //ay isimlerini girince kacinci ay oldugunu yazan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz");
        String ayIsmi = input.next();

        if (ayIsmi.equalsIgnoreCase("Ocak") ){
            System.out.println("1");
        } else if (ayIsmi.equalsIgnoreCase("Subat")) {
            System.out.println("2");
        } else if (ayIsmi .equalsIgnoreCase("Mart")) {
            System.out.println("3");
        } else if (ayIsmi.equalsIgnoreCase("Nisan")) {
            System.out.println("4");
        } else if (ayIsmi .equalsIgnoreCase("Mayis")) {
            System.out.println("5");
        }else if (ayIsmi.equalsIgnoreCase("Haziran")) {
            System.out.println("6");
    }else if (ayIsmi.equalsIgnoreCase("Temmuz")) {
        System.out.println("7");
        }else if (ayIsmi.equalsIgnoreCase("Agustos")) {
            System.out.println("8");
        }else if (ayIsmi.equalsIgnoreCase("Eylul")) {
            System.out.println("9");
        }else if (ayIsmi.equalsIgnoreCase("Ekim")) {
            System.out.println("10");
        }else if (ayIsmi.equalsIgnoreCase("Kasim")) {
            System.out.println("11");
        }else if (ayIsmi.equalsIgnoreCase("Aralik")) {
            System.out.println("12");
        }else System.out.println("lutfen gecerli bir ay ismi  iriniz");
        /*
        Stringklerin esitliklerini kontrol etmek icin "=="yerine "equals())kullaniriz.
        Niye ?
        /*
Stack Memory'de
1)Primitive Data'lar depolanir
2)Non-primitive'lerin adresleri depolanir.(Reference)
Heap Memory'de Non-primitive'ler depolanir.

Primitive Data: char,boolean,byte,short,int,long,float,double
Non-primitive Data: String,Wrapper Class,sizin olusturdugunuz Class'lar
 */

}
}