package day10switchloops;

import java.util.Scanner;

public class Swich02 {
    public static void main(String[] args) {
//Exemple1: kullanicidan iki sayi ve yapilacak islemi alan ve +,-,* /,% islemlerini yapan kodu yaziniz
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double a= input.nextDouble();
        double b= input.nextDouble();
        System.out.println("yapilacak islemi giriniz . +,-,/,*,% dan birini seciniz...");
        char opr=input.next().charAt(0);


        switch (opr){//swithin icine koydugumuz sey char, string,byte ,short ve int olmalidir
            case '+':
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a/b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a*b));
                break;

            case '%':
                System.out.println(a + "%" + b + "=" + (a%b));
            break;
            default:
                System.out.println("bu islem tanimlanmamistir");

        }
    }
}
