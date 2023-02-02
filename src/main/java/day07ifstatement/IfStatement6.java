package day07ifstatement;

import java.util.Scanner;

public class IfStatement6 {
    public static void main(String[] args) {
/*
        Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
        asagidaki tabloya gore yazdiran kodu olusturunuz
        0-4 ==> bebek
        5-12 ==> cocuk
        13-20 ==> genc
        21-30 ==> yetiskin
        Tanimlanmamis Evre
        Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz

 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz");
       int age = input.nextInt();
       if (age<0){
           System.out.println("lutfen gecerli bir yas giriniz");

       } else if (age<5) {
           System.out.println("bebek");
       } else if (age<13) {
           System.out.println("cocuk");
       } else if (age<21) {
           System.out.println("genc");
       } else if (age>11) {
           System.out.println("yetiskin");
       }else {
           System.out.println("Tanimlanmamis yas....");
       }
    }
}