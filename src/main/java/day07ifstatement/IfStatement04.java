package day07ifstatement;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        //gun sayisini verince gun ismini yazan kodu yazin

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        byte gun = input.nextByte();

        if (gun == 1) {
            System.out.println("pazar");
        } else if (gun == 2) {
            System.out.println("pazartesi");

        } else if (gun == 3) {
            System.out.println("sali");
        } else if (gun == 4) {
            System.out.println("carsamba");
        } else if (gun == 5) {
            System.out.println("persembe");
        } else if (gun == 6) {
            System.out.println("cuma");
        } else if (gun == 7) {
            System.out.println("cumartesi");


        } else System.out.println("gecerli bir gun sayisi giriniz");
    }

}