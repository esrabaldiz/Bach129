package day28exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
   /*
    1)Exception demek beklenmedik problem demektir. Seyahatte benzinin bitmesi arabanin bozulmasi gibi.
    2)Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir. Mesela benzin bitince yol yardimi
      arariz. Applicationlarda da beklenmedik problemler icin cozum yollari uretmeliyiz, bu isleme "Exception Handling" denir
    3)Exception'lar temel olarak ikiye ayrilirlar.
        i)Compile time exception:Siz kod yazarken farkedilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir.
        ii)Run time exception: Siz code yazarken farkedilmez ama, code'u calistirdiginizda console'da hata alirsiniz.
    4)Exception disina "Error" diye adlandirdigimiz "Handle" edilemeyen problemler vardir.
      Gercek hayatta soforun olmesi gibi, handle edilemeyecek durumlar "Error"dur.
      Applicationlar'da "Memory"nin dolmasi "Error"dur.
      İki tur memory var. i)Stack Memory dolarsa "StackOverFlow Error" alirsiniz.
                          ii) Heap Memory dolarsa "OutOfMemory Error" alirsiniz.
     5)Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
     6)if else kullanirsak olusabilecek her problemi spesifik olarak if parantezinin icine yazmamiz gerekir.
       Bu da ciddi bir matematik bilgisi gerektirir ve yazacagimiz code u cok uzatir.
       Ama try catch'te Java ilgili Exception ile alakali olusabilecek butun problemleri yakalar.
     7)
     */


            int a = 12;
            int b = 0;

            divide(a, b);

            divide2(a, b);

        }

        //Arithmetic Exception yazdiginiz code'da metamatik islem kullaniyorsaniz alinabilecek bir Exception'dir.
        //Nasil handle edilecegini asagida yazdik.
        public static void divide ( int a, int b){

            try {


                System.out.println(a / b);

            } catch (ArithmeticException e) {

                System.out.println("Do not divide by zero");
            }

        }

        //Exception Handling de if-else kullanilmaz. Bkn.6.madde
        public static void divide2 ( int a, int b){
            if (b == 0) {
                System.out.println("Dont divide bye zero");
            } else {
                System.out.println(a / b);
            }
        }
    }
