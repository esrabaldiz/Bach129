package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        List<Character> initials=new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('D');

  //Note:bir  listte kac eleman  oldugunu nasil anlariz?//size() methodu ile anlariz.Arraylerden
 // bahsederken lenght demeliyiz Listlerden bahsederken ise "size kullanmaliyiz
        int eleman=initials.size();
        System.out.println(eleman);//4

  //bir listten istenen elemn nasil alinir?
char u=initials.get(2)  ;

System.out.println(u);//M

 //verilen bir String listteki elamnalarin karakter sayisini bulan kodu yaziniz
        List<String>cities=new ArrayList<>();
     cities.add("Miami");
     cities.add("Istanbul");
     cities.add("Kayseri");
     cities.add("Almaty");

     //1.yol
     int sum=0;
     for (String w:cities){
       sum=sum + w.length();
     }
        System.out.println(sum);

     //2.yol
int toplam=0;
        for ( int i =0 ; i<cities.size();i++){
            toplam+=cities.get(i).length();
        }
        System.out.println(toplam);

 //Bir listteki istenen bir elemani nasil degistirebiliriz?
 cities.set(0,"New York") ;
        System.out.println(cities);


 //Exemple2:Mass listi olusturunuz ve maaslara % 20 zam yapiniz
        List<Double> salary=new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
//1.yol
        int idx=0;
        for (Double w: salary){
         salary.set(idx, w*1.20);
         idx++;
        }
        System.out.println(salary); // [23400.3, 10200.9, 39000.6]

//2.yol
for (int i=0 ; i<salary.size() ; i++)  {
    salary.set(i, salary.get(i)*1.20);
}
        System.out.println(salary);//[28080.359999999997, 12241.08, 46800.719999999994]



    }
}
