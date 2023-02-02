package day06stringmanuoulations;

public class StringManipulations01 {
    public static void main(String[] args) {
//exemple:bir stringin bas ve sonunda space caracteri varsa siler
        //"  Ali Can   "   ====>"Ali Can"
        String s = " Ali  Can";
        System.out.println(s);

//trim() methodu bir stringin bas ve sonundaki bosluklari siler yani space caracterlerini siler , aradaki spacelere dokunmaz
        String sTrimed = s.trim();
        System.out.println(sTrimed);

        //Exemple:2 asagidaki fiyatlari  verilen urunlerin toplam fiyatini bulunuz
        //String tv = "$456.99";   , String  laptop="$875.99";  ,

        String tv = "$456.99";
        String laptop = "$875.99";

        String yeniPara = tv.replace("$", "");
        System.out.println(yeniPara);

        String yeniPara2 = laptop.replace("$", "");
        System.out.println(yeniPara2);

        System.out.println(yeniPara2 + yeniPara);
        Double totalPrice = Double.valueOf(yeniPara) + Double.valueOf(yeniPara2);//valuOf()stringi double a cevirir
        System.out.println(totalPrice);

        //verilen ismin ilk harfini ve soyismin ilk harfini ekrana yazdiriniz
        //"Ali Can "===> AC

        String name = "   aLI cAn     ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);
        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);
        System.out.println("" + first + second);//eger matematiksel bir islem yapiyorsak stringin basina sout icinde en basa bir bos string ifadesi koymaliyiz

//bir stringin hic karakter icermedigini (bos string) kontrol eden kodu ciziniz
        String str = "x";
//1.yol:lenght() kullan
        boolean result1 = str.length() == 0;//== sembolu karsilastrima opretaorudur karsilastirma operatorleri ise bize boolean verir
        System.out.println("String bos mu?  : " + result1);//true
//2.Yol

        boolean result2 = str.isEmpty();
        System.out.println(result2);
//ex:bir stringin space haric hicbir karakter icermedigini kontrol eden kodu yazinz
        String t = "            ";
//1.Yol
        boolean result3 = t.replace(" ", "").length() == 0;

        System.out.println("Sadece space mi var? " + result3);

        //2.yol
        boolean result4 = t.replace(" ", "").isEmpty();

        System.out.println("Sadece space mi var? " + result4);
        // 3.yol
        boolean result5 = t.isBlank();//isBlack() stringin icinde sadece space mi var ona bakar space varsa true verir yoksa false verir
        //  isBlack()methodu bos stringler icinde true verir
        //   isBlack() ==> space + hicbirsey icin true verir.isEmpty==> hic bir sey icin true verir
        // bir stringde a,e,i characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        String r = "java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);

        int idxE = r.indexOf('e');
        System.out.println(idxE);

        int toplam = idxI + idxA + idxE;
        System.out.println(toplam);


        //exemple7: bir stringde java kelimelerinin kacinci indexte yazildigini gosteren kodu yaziniz
        //        "Ah Java  vah Java sensiz olmuyir Java"
        String u = "Ah Java  vah Java sensiz olmuyor Java";
        int idxJava = u.indexOf("Java");//indexOf("java")  kullaniminda "Java"kelimesinin ilk harfin indexini almis olursunuz

        System.out.println(idxJava);

        int idxXyz = u.indexOf("xyz");//indexOf methodu olmayan karakterler icn her zaman -1 verir
        System.out.println(idxXyz);//-1


//exemple: Bir stringde a,e,i characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz
//        "Java is easy to learn " ==>
        String mtr = "Java is easy to learn ";
        int sonG = mtr.lastIndexOf('a');
        System.out.println(sonG);
        int sonG2 = mtr.lastIndexOf('e');
        System.out.println(sonG2);
        int sonG3 = mtr.lastIndexOf('i');
        System.out.println(sonG3);
        System.out.println(sonG + sonG2 + sonG3);
//Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zman "-1"verir


        //Exemple 9: Bir Stringdeki tekrarsiz characterleri ekrana yazdiriniz
        String y = "aac";
        char ch1 = y.charAt(0);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }
            char ch2 = y.charAt(1);
            if (y.indexOf(ch2) == y.lastIndexOf(ch2)) {
                System.out.println(ch2);
            }
            char ch3 = y.charAt(2);
            if (y.indexOf(ch3) == y.lastIndexOf(ch3)) {
                System.out.println(ch3);
            }
//sayi pozitif ise ekrana pozitif yazdiriniz
            int number = 12;

            if (number > 0) {
                System.out.println("sayi pozitif sayidir");
            }
            //exemple: sayi -1 ile 10 arasinda ise ekrana "rakam"yazdiriniz
            int sayi = 30;
            if (sayi > -1 && sayi < 10) {
                System.out.println("rakam");
            }


        }
    }







