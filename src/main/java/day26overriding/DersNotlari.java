package day26overriding;

public class DersNotlari {
    /*
    1)Parent Class'daki method'u Child Class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.
        2)Overriding'de method'un parantezine, method'un ismine dokunulmaz, method'un body'si degistirilir.
        3)@Override ==> Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar
        4)Overriding'de parent class'daki method'a "Overridden Method", child class'daki  method'a ise "Overriding Method" denir.
        5)"private" method'lar "override" edilemezler.
        6)Child Class'daki override edilmis method(Overriding Method)'un
          access modifier'i Parent Class'daki override edilmis method(Overridden Method)'un
          access modifier'indan dar olamaz
          Overridden Method ==> protected ise Overriding Method ==> protected + public
          Overridden Method ==> default ise Overriding Method ==> default + protected + public
          Overridden Method ==> private ise Overriding Method ==> override olmaz ki access modifier'i olsun. (Bkz 5. kural)
        7)Child Class'da override edilen method'un(Overriding Method) return type'i method'un return ettigi data type'inin aynisi veya o data type'inin
          parent'i olarak secilebilir.
        8)Method'un return type'i "primitive" ise, Overriding yaparken return type degistirilemez. Cunku; return type ya ayni olur veya parent'dan secilir ama
          primitive'ler arasinda "parent-child iliskisi" olmadigindan parent'dan secmek mevzu bahis olamaz o zaman tek secenek aynisi olmalidir kalir.
        9)Method'un return type'i "Wrapper Class" ise, Overriding yaparken return type degistirilemez. Cunku; return type ya ayni olur veya parent'dan secilir,
          ama Java bir wrapper class'i digerinin parent'i yapmadigindan parent'dan secme ihtimali yoktur, geriye sadece aynisi olma ihtimali kalir.
        10)Method'un return type'i "void" ise, Overriding yaparken return type degistirilemez.

        11) Final kelimesini "Variable"larda kullanabilirsiniz.
                    ->final variable ise
                    i) mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez

        12)Final kelimesini "Method" larda kullanabilirsiniz.
                     ->method final ise;
                      i)methodun body'si değiştirilemez
                      ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

        13)Final kelimesini "Class"larda kullanabilirsiniz.
                       ->class final ise;
                       i)o class'ın child'ı olamaz
        14) "final" method'lar ve "static" method'lar "override"  edilemezler.
        15)"Override" yapabilmek icin "Inheritance" sarttir. Baska bir ifadeyle; Parent-Child iliskisi sarttir.
        16) Method Overloading "Compile Time Polymorphism" dir, Method Overriding "Run Time Polymorphism" dir.
        17) Method Overloading "static Polymorphism" dir, Method Overriding "dynamic Polymorphism" dir.
    *****sokrative notları*****
1) Final kelimesini "Variable"larda kullanabilirsiniz.
                    ->final variable ise
                    i) mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez

 2)Final kelimesini "Method" larda kullanabilirsiniz.
                     ->method final ise;
                      i)methodun body'si değiştirilemez
                      ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

 3)Final kelimesini "Class"larda kullanabilirsiniz.
                     ->class final ise;
                       i)o class'ın child'ı olamaz

   //staticler overload yapilabilir ama override yapilamazlar
   //"final" methodlar  ve static methodlar "override "edilemezler
ENCAPSULATION DERS NOTLARI
/*
    Biz bazen bir Class'in icindeki datalari saklamak isteriz. Mesela ogrencinin Student id'yi herkes bilmemeli degil mi?
Arkadaslar kapsul seklinde ilaclar vardir. Bu kapsullere toz ilac koyarlar.
Napmis oluyorlar ilaci o kapsulun icinde saklamis oluyoruz. Bu kapsulu Class gibi dusunun,
icindeki toz ilaci da variable olarak dusunun. Ben bu sekilde bir ilac uretirsem ilaci kapsulun icinde saklamis olurum.
Bu ise kapsulleme ingilizce ENCAPSULATION denir. Benim ilk aldigim offerda aldigim soru buydu.
What is encapsulation could you please tell me? dedi. Ben de dedim ki "Data Hiding" dedim. Sorarlarsa boyle diyin
offer alirsiniz :)) dedi.
    "private" access yaparak encapsulation yapmis oluruz. Ilanin disindayken ilaci goremeyiz. Kapsulun icinden goruruz.
Ayni mantikla Class'in icinde olursak "private" datayi goruruz. Ayni bu kapsulde oldugu gibi.
Simdi size dicekler ki encapsulation nedir. Data Hiding. Data nasil saklanir. Access Modifier private yapariz. diyeceksiniz, dedi.
// nicin encapsulation yapariz?
cevap: cunku bazi bilgileri guvenlik icin saklamamiz lazim.

     */
}
