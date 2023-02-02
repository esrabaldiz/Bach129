package day07ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //verilen bir sayinin pozitif negatif veya notr oldugunu kontrol  kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num = input.nextInt();

if (num>0) {
    System.out.println("pozitif");

}else  if (num<0)    {
       System.out.println("negatif");
   }else
       System.out.println("notr bir sayidir");

    }
}
