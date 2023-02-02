package day07ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
//Exemple2:  kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num = input.nextInt();
        //1.yol
        if (num % 2 == 0) {
            System.out.println("cift sayi");
        }
        if (num % 2 != 0) {
            System.out.println("tek sayi");
        }
        //2.yol
        if (num % 2 == 0) {
            System.out.println("cift sayi");
        } else {
            System.out.println("tek sayi");
        }

    }
}