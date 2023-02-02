package day13whileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        /*
        kullanicidan bir tam sayi aliniz > Eger tam sayi 100 den kucuk ise kullaniciya "Kaybettiniz"mesaji vererek oyunu sonlandiriniz
        tam sayi 100 ve 100 den buyuk ise "kazandiniz "mesaji vererek oyuna devam ettiniz
         */
        Scanner input=new Scanner(System.in);
        int num=0;
        do {
            System.out.println("bir sayi giriniz");
            num=input.nextInt();
            if (num>100)   {
                System.out.println("kazandiniz");
            }
        }while(num>=100);
            System.out.println("kaybettiniz");
        }

    }

