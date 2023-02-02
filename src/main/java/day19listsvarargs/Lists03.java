package day19listsvarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lists03 {
    public static void main(String[] args) {
        /*
                SAYI TAHMIN OYUNU
    Oyuncudan 1-10 arasi bir sayi isteyiniz
    Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
    Yoksa verdigi sayiyi listenize ekleyiniz.
    Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
    [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
    [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
    [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
*/
        Scanner input=new Scanner(System.in);

        List<Integer> numLists= Arrays.asList(5,8,2,9);

        List<Integer> numsList = new ArrayList<>();
        numsList.add(5);
        numsList.add(8);
        numsList.add(2);
        numsList.add(9);

        do {
            System.out.println("lutfen 1 ile 10 arasinda bir tam sayi giriniz");
            int num= input.nextInt();
        }while(true);
    }
}
