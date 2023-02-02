package day13whileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //  Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("carpim tablosunu gormek icin bir sayi giriniz");
        int num=input.nextInt();

        int i=1;

        while(i<11){
            System.out.println(num + "x" + i + "=" + (num * i));
            i++;
        }
//Exemple: verilen bir stringde her harften sonrasina "*" sembolu ekleyiniz

//Java ==>>J*a*v*a

System.out.println("bir kelime giriniz");

   String word=input.next();
   String newWord=" ";
   int k=0;
    while(k<word.length()){
   newWord=newWord+word.charAt(k) + "*";

  k++;
    }
      System.out.println(newWord);
      System.out.println();
//2.yol kendi ornegim
        System.out.println("bir cumle giriniz");
        String kelime=input.next();
        String yeniKelime=" ";
        int j=0;
        while (j<kelime.length()){
            yeniKelime=yeniKelime+kelime.charAt(j) +  "*";
            j++;

        }
        System.out.print(yeniKelime);
    }



}
