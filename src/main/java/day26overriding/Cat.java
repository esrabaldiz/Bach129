package day26overriding;
/*
primitive 'lerde  override yapilirken return type degistirilemez
primitiveler class olmadigindan Overridden'a Object de yazamayiz.
Wrapper Class'lar Class oldugu icin Overridden'a Object yazabiliriz.
Final kelimesinin Variable'larda kullanimi : Variable "final ise
i)Mutlaka deger atanmalidir
ii)Ilk atanan deger degistirilemez.
Ornek kullanimi : public final double pi = 3.14;
/*


 */
public class Cat extends  Mammal {
    public void meow() {
        System.out.println("Cats meow...");
    }

    @Override //Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar
    public void eat() { // Child'daki override edilmis eat() method'una "Overriding Method" denir
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a * b;
    }
}