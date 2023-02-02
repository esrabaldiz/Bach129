package day13whileloop;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
       /*
IT'de yeni bir sey ogrenirken;
    i) "Ne? Nedir?" oldugunu ogren
    ii) "Neden var? Nicin var?" oldugunu ogren
    iii) "Simple Implementation - Basit Uygulama"
         "Mid-Level Implementation - Orta Duzey Uygulama"
         "Advance-Level Implementation - Ileri Duzey Uygulama"
         "Project-Level Implementation - Proje Duzeyinde Uygulama"
    yapmak lazim.

    Piyasadakiler simple'da takilir. Siz simple-mid arasi levelde takilirsaniz ise girersiniz, dedi

 */

        int a = 12;//Bu yapinin icinde sadece 1 tane data depolanabilir.
        //Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyacı hissederiz.
        // Bir yapinin icinde coklu data depolayabilme icin Java "Array" yapisini olusturmustur.

        //Array nasil olusturulur?
        //Array olusturmak icin Array elemanlarinin "data type" ı ve "eleman sayisi" mutlaka yazilmalidir.
        String stdNames[] = new String[5];

        //Array console'a nasil yazdirilir?
        //toString() method'unu kullanmadan sadece array ismi ile yazdirirsaniz Java o Array'in adresini yazdirir.
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]

        //Array e nasil eleman eklemesi yapilir?
        stdNames[2]="Ajda";
        System.out.println(Arrays.toString(stdNames));
        System.out.println(Arrays.asList("cuneyt","kemal","Ajda","Ezel","Besir"));
        stdNames[0]="Ajda";
        stdNames[1]="Cuneyt";
        stdNames[2]="Kemal";
        stdNames[3]="Ezel";
        stdNames[4]="Besir";
        System.out.println(Arrays.toString(stdNames));

        //Arrayden specifik bir elemani almak
        System.out.println(stdNames[2]);

        //Exemple 1: Arraydeki her elemanin sonuna "!" isareti koyarak ekrana yazdiriniz
       for (int i=0 ; i<stdNames.length ; i++ ){//Arraylerde lenght ín sonuna paratez koymadan kullaniriz
           System.out.println(stdNames[i] + "!");
       }








    }
}
