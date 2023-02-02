package day20passbyvaluemethodoverloading;
//method overloading yaparken  ayni class'da yapilir baska classá gidilmez private ya da publicde olsa bu boyledir.
//staticler her yerden update edilebilirdirler.yani staticler her bir update isleminden haberdar olmak icin yapilir
//non staticler objeye yapistirilir staticler ise classa yapistirilir
//claslar objelerın kalıbıdır o kalıplardan objeler olusrurulur
//objelere class denmez
//non staticlere ulasmak icin obje olusturmaliyiz
//scanner bır calssdır
public class MethodOverloading01 {
    public static void main(String[] args) {

        add(3, 5);
    }

//   public static void add(int a, int b) {
//       System.out.println(a + b);
//   }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }
    public static void add(int a,int b,int c) {//add(int a,int b,int c) ==>> method signature
        System.out.println(a + b +c);

    }
}