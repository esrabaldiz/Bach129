package day12forloopwhileloop;

import java.util.Scanner;

public class Deneme1 {
    public static void main(String[] args) {
        int sayi=2019;
      sayi= Math.abs(sayi);
      int sum=0;
      while(sayi>0){
          sum+=sayi%10;
          sayi/=10;
      }
        System.out.println(sum);
    }
}