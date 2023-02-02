package day09incrementdicrementternaryswich;

public class IncremenDicrement01 {
    public static void main(String[] args) {


int a=5;

    //INCREMENT
        a=a+2;// veya a +=2;
        System.out.println(a);

//Exemple 1 :Bir tane integer variable olustrurun ve onu iki sekilde 5 arttirin
        int b=8;
        System.out.println(b);
        b=b+5;
        System.out.println(b);
        b +=5;
        System.out.println(b);

       //decrement
       int c=8;
        System.out.println(c);
        c -= 3;

        System.out.println(c);
        c= c-3;

       System.out.println(c);
//Increment 2:
        int d=6;
        System.out.println(d);
        d=d*2;
        System.out.println(d);
        d *=2;
        System.out.println(d);

        //decrement
      int   e=24;
        System.out.println(e);
        e=e/2;
        System.out.println(e);
        e /=2;
        System.out.println(e);


        // "1"  increment ve decrement
        int f=12;
     //   f=f+1;
     //   f+=1;
        f++;
//"1"ile decrement
        int h=10;
        //h=h-1;
        //h-=1;
        h--;
  //"post - increment" ve "pre-increment "
       int i=10;
       int k=i++;// post-increment cunku increment , variableïn isminden sonra yazildi
        //i==> variable ++ ise incremennt
        System.out.println(k);
        System.out.println(i);

int m=15;

int n =++m;//++increment  m=ise variable==> bu ise pre incrementtir. Cunku increment variable isminden once yazildi
        System.out.println(m);
        System.out.println(n);


        //post -decrement ve pre-decrement
        int p=17;
        int r=p--;
        System.out.println(p);
        System.out.println(r);


        int s=20;

        int t=--s;//once dicrement var ise yani variable den once dicrement var ise sayi once azalir sonra yazilir.
        // yani bu once azalt sonra yazdir demektir//eger s-- olsaydi once yazdirir sonra azaltirdik
        System.out.println(s);
        System.out.println(t);
    }
}
