package day21statickeyword;

public class Student {
    /*
    1)Static variable veya static methodlar(class member )
    tum objectler icin ortak elemandir.
    2)static class member'ler uzerinde yapilan tum degisiklikler tum objeleri etkiler.
    3)static class memeber'ler  classá, non _ static class member'ler object'lere monte edilir
      */
    public static  String stdName="Tom Hanks";
    public  int age=13;
//ogrenci isminin ilk harflerini  veren methodu olusturunuz
    public  static  String getInitials(String name){
        String first =name.substring(0,1);
        String second =name.split(" ")[1].substring(0,1);
        return  first+second;
        /*
String second = name.split("")[1].substring(0,1); // kestikten sonra birinci index'teki
//soyadi aldi, [1]==> bunu 1. index'teki soyadi alabilmek icin yazdi
// ve onun 0'inci degerini alabilmek icin substring(0, 1) yazdi "C" yi almak icin yazdi
// "first" ==> "A" , "second"==> "C" oluyor
NOTE://static methodlar class isimleri ile cagrilirlar obje ismiyle cagrilmazlar
         */
    }
    //ogrenci ismindeki sesli harfleri sayan method olusturunuz
    public int countVowels(String name){
        int counter=0;
        for (int i=0; i<name.length(); i++){
           char ch= name.toLowerCase().charAt(i);
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
              counter++;
              break;
            }
        }
        return counter;
    }

}

