package day27encapsulationabstraction;

public abstract class Courses {
    /*
    bodysi olmayan methodlari child classlarin hepsi  kullanmak zorunddir
 Or: yani abstract  methodu butun child'lar kullanmak zorunda kalir
  Bir method "parent class" da "abstract method" ise;
//Child Class o method'u "override" edip kullanmak zorundadir.
//Bu yuzden her hangi bir fonksiyonu "Child Class" icin mecburi yapmak isterseniz o method'u "abstract" yapmalisiniz.
 1) Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
    Body'si olmayan method'lara "abstract method"lar denir.

    2)"abstract method"'lar child class'lar tarafindan "override" edilmek zorundadırlar.
    Bu yuzden eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseni
     o method'u  abstract yapmak gerekir.

     3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
     "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

     4)"abstract method" lar siradan class'larin icine yazilamazlar."abstract method"larin icine yazildiklari
     class'lar da abstract olmak zorundadirlar.
     //concret methodlar override edilir , abstract methodlar ise implement edilir
     */
    public abstract  void math();
    public void art(){
        System.out.println("Paiting");
    }
    //final method'lar "override" edilemezler, halbuki "abstract" method'lar override edilmek icin olusturulurlar.
//Bu celiskidir bu yuzden Java abstract method'larin final olmasina musaade etmez.
//public final abstract void science();

//Concrete class'lar final oldugunda Child Class'a sahip olamazlar.
//Ama "Abstract Class"lar icin Child Class olmalidir cunku Child Class'lar abstract parent class'daki abstract method'lari kullanirlar.
//Bu yuzden Java "Abstract Class"larin "final" olmasina musade etmez.

//"abstract method" lar "private" olamazlar cunku Child class'lar "abstract method"lari kullanirlar, private yapinca kullanima kapali olur.
//Bu celiskidir bu yuzden Java "abstract method"larin "private" olmasina musaade etmez.

 //concretler abstractlari  override etmek zorundadir.

}
