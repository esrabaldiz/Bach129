package day13whileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {
 //while-loop
        int i =1;
        while(i<1){
            System.out.println("Sen bir while loopsun...");//1)while loop da zero execution mumkundur
                                                           //2)while body hic calismadi
            i++;
        }

//do-while-loop
int k=1;                                                     //1)do-while body calisti
        do {                                                //2)do-while kullandiginizda loop body en az bie kere calisir
            System.out.println("sen bir do-while-loopsun");//do-while da "zero execution" mumnkun degildir.
k++;
        }while(k<1);

    }
}
