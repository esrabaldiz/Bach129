package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {


    int sonuc = add(30, 50);
            System.out.println(sonuc);

    long carpmaSonucu = multiply(3, 6);
            System.out.println(carpmaSonucu);

    int ucluSonuc = firstTwoMultiplyThirdAdd(2, 5, 8);
            System.out.println(ucluSonuc);

    double kup = getCube(5);

        System.out.println(kup);

        int dikdorgen=dikdortgeAlaniHesapla(8,5);
        System.out.println(dikdorgen);
        System.out.println(dikdorgen);

}

public static int add(int a, int b){
        return a+b;
        }

protected static long multiply(int a, int b){
        return a*b;
        }

//Ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
        }

//Ornek 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.
//Note: Access Modifier'i default yapmak access modifier'i yazmayiniz
static double getCube(double a){
        return a*a*a;
        }
public static int dikdortgenCevreiHesapla(int a,int b){
    return  (a*b);
}

    public static int dikdortgeAlaniHesapla(int a,int b){
        return 2*(a+b);
    }
        //1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
        //2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        //4)Dairenin alaninio hesaplayan methodu olusturunuz ve kullaniniz

}


