package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);

        List<Double> half = getHalfOfElementGreaterThanFiveDistinctReversed(myList);
        System.out.println(half);
        System.out.println();


        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brade");
        list.add("Cuneyt");
        list.add("John");
        list.add("Ajda");


        printAllAlphabeticallyUpperDistinct(list);
        System.out.println();
        tekrarsizYazdir(list);
        System.out.println();
        printAllSortWithLengthUpperDistinct(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct(list);
        System.out.println();
        removeElementIfTheLenghtGreaterThanFive(list);
        System.out.println();
        removeElementIfStartsWithAorEndsWithd(list);
        System.out.println();

        //Create a method to find the half of the elements greater tahan,5 ,distinct, in reverse order in a list
        //5'ten buyuk tekrarsiz elemanlarin
    }

    public static List<Double> getHalfOfElementGreaterThanFiveDistinctReversed(List<Double> myList) {
        return myList.stream().distinct().filter(t -> t > 5).map(t -> t / 2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }

    //tum list elemanlarini buyk harfle alfabetik sirada tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallyUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted().forEach(t -> System.out.print(t + " "));
    }

    //Example 3: Tum list elemanlarini kucuk harfle alfabetik siranin tersinde ve tekrarsiz olarak yazdiriniz
    public static void tekrarsizYazdir(List<String> list) {
        list.stream().distinct().map(t -> t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
        //tom cuneyt brade angelina
    }

    ////Example 4: Tum list elemanlarini buyuk harfle, uzunluklarina artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLengthUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.length())).forEach(t -> System.out.print(t + " "));
        //TOM AJDA BRADE CUNEYT ANGELINA
    }

    ///Example 5:Tum list elemanlarini buyuk harfle son harflerine gore artan sirada , tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastCharUpperDistinct(List<String> list) {
        list.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                //t->t.charAt(t.length()-1 bu ifade lambda expression olarak degerlendirilir
                        sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));
    }

    ////Example 6: Tum list elemanlarini buyuk harfle, uzunluklarina artan sirada, tekrarsiz olarak yazdiriniz
    //uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String> list) {
        list.
                stream().
                distinct().
                map(String::toUpperCase).//String::toUpperCase yapisina "method reference" denir.
                sorted(Comparator.comparing(String::length).
                thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);

    }

    ////Example 6:karakter sayisi 5'ten fazla olan elemanlari siliniz ve sonucu list olarak yazdiriniz
    public static List<String> removeElementIfTheLenghtGreaterThanFive(List<String> list) {
        list.removeIf(t -> t.length() > 5);
        return list;
    }

    //Example 8: "A" ile baslayan veya "d" ile biten elemanlari siliniz
    public static List<String> removeElementIfStartsWithAorEndsWithd(List<String> list) {
        list.removeIf(t -> t.startsWith("A") || t.endsWith("d"));
        //Bazen "stream()" methodu bize lazim olan methodlara ulasmamiza engel olur. Bu yüzden "stream()" methodunu kullanmayız
//"removeIf()" methodunda olduğu gibi.

//Fakat "stream()" methodunu daha sonradan kullanmamız gerekibilir. Bu durumda "stream()" methodunu kullanarak istediğimiz methodlara
//ulasiriz, distinct() methoduna ulaştığımız gibi.

// sonuc bize list olarak lazımsa "collect(Collectors.toList()" ile sonucu List'e ceviririz
        return list.stream().distinct().collect(Collectors.toList());
    }
    //9)List elemanlarini character sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz
    public  static List<Integer> printLenghtSquare(List<String> list){
     return list.stream().map(t->t.length()*t.length()).collect(Collectors.toList());
    }

}





