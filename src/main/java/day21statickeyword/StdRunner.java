package day21statickeyword;

import java.util.List;

public class StdRunner {
    public static void main(String[] args) {
        System.out.println(Student.stdName);
        Student std1= new Student();//non static olani cekmek icin o classin adiyla
        // object olusturmaliyiz.age variableni student clasindan almak icin
        // Student clas adiyla object olusturduk
        System.out.println(std1.age);

        String initials=Student.getInitials("Sefa Eyer");
        System.out.println(initials);

        int vowels=  std1.countVowels("Tom Cruse");
        System.out.println(vowels);//4// static olmadigi icin buna obje ile ulastik ve
        // objedeki methodlari boylece kullanabiliriz

        // static olanlari obje ile cagirmak tavsiye edilmez
        String s=std1.getInitials("Ali Can");
        System.out.println(s);
//list olusturmada yeni bir isilti
  List<String>  names  =  List.of("Ali", "Veli" , "Can" ,"Kemal");
        System.out.println(names);
    }
}
