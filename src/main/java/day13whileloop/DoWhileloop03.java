package day13whileloop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DoWhileloop03 {
    public static void main(String[] args) {
        /*
        Gecerli Username="admin" ve Password="pwd123" dur.
                Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username ve password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username ve password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz

         */
        Scanner input=new Scanner(System.in)    ;



        int counter=0;
        do {
         if (counter==4) {
             System.out.println("hesabiniz bloke olmustur!");
             break;
         }
             System.out.println("usernameí giriniz..");
             String username=input.next();

             System.out.println("passwordu giriniz...");
             String password=input.next();
             if (username.equals("admin") &&password.equals("pwd123")){
                 System.out.println("hesabiniza hosgeldiniz!...");
                 break;
             }
             counter++;

            System.out.println();
        }while (true);

    }
}
