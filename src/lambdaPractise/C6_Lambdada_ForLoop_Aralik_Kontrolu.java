package lambdaPractise;

import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {

    public static void main(String[] args) {
        birdenOtuzAKadarsayılarıSırala(30);
        System.out.println("\n*****");
        birdenOtuzDahilKadarsayılarıSırala(30);
        System.out.println("\n*****");
        istenenİkiDegerAraSayıTop(1,10);
        System.out.println("\n*****");
        otuzİleKırkAraSayıOrt(30,40);
        System.out.println("\n*****");
        ucyuzyirmibeşİleDörtaltmışsekizAraSekzBölSayıAdedi(325,468);
        System.out.println("\n*****");
        ucyuzyirmibeşİleDörtaltmışsekizAraSekzBölSayılar(325,468);
        System.out.println("\n*****");
        ucyuzyirmibeşİleDörtaltmışsekizAraSekzBölSayılarToplamı(325,468);
        System.out.println("\n*****");
        yediİleOnbesArasındaTekSayıCarp(7,15);
        System.out.println("\n*****");
        poztTekSayİlkOnElYazd(1);
        System.out.println("\n*****");
        yirmibirdenBaslaYediKatıTekOlanİlkOnTerm(21);
        System.out.println("\n*****");
        yirmibirdenBaslaYediKatıİlkYirmiTerim(21);

    }

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)

    //range(int startInclusive, int endExclusive)

    public static void birdenOtuzAKadarsayılarıSırala(int x){
        IntStream.range(1,x).forEach(Methods::yazInteger);
    }


    //S2 1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)

    //rangeClosed(int startInclusive, int endInclusive)
    public static void birdenOtuzDahilKadarsayılarıSırala(int x){

       IntStream.rangeClosed(1,x).forEach(Methods::yazInteger);
    }

    //S3 Istenen iki deger(dahi) arasindaki sayilari toplayalim

    public static void istenenİkiDegerAraSayıTop(int istenen1,int istenen2){
        System.out.println(IntStream.rangeClosed(istenen1, istenen2).sum());

    }


    //S4: 30 ile 40 arasindaki sayilarin (dahi) ortalamasini bulalim
    public static void otuzİleKırkAraSayıOrt(int x,int y){

        System.out.println(IntStream.rangeClosed(x, y).average());
    }


    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?
    public static void ucyuzyirmibeşİleDörtaltmışsekizAraSekzBölSayıAdedi(int x,int y){

        System.out.println(IntStream.rangeClosed(x, y).filter(t -> t % 8 == 0).count());
    }


    //S6: 325 ile 468 arasinda 8 bolunen sayilari yazdiralim
    public static void ucyuzyirmibeşİleDörtaltmışsekizAraSekzBölSayılar(int x,int y){

       IntStream.rangeClosed(x, y).filter(t -> t % 8 == 0).forEach(Methods::yazInteger);
    }

    // S7:325 ile 468 arasinda 8 bolunen sayilarin toplamini bulalim

    public static void ucyuzyirmibeşİleDörtaltmışsekizAraSekzBölSayılarToplamı(int x,int y){

        System.out.println(IntStream.rangeClosed(x, y).filter(t -> t % 8 == 0).sum());
    }
    // S8: 7ile 15 arasindaki tek sayilarin carpimini bulalim

    public static void yediİleOnbesArasındaTekSayıCarp(int x,int y){

        System.out.println(IntStream.rangeClosed(x, y).filter(t -> t % 2 != 0).reduce(Math::multiplyExact));
    }


    //S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim
    public static void poztTekSayİlkOnElYazd(int x){
        IntStream.iterate(1,t->t+2).limit(10).forEach(Methods::yazInteger);

    }


    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim
        public static void yirmibirdenBaslaYediKatıTekOlanİlkOnTerm(int x){

        IntStream.iterate(21,t->t+7).filter(Methods::tekMi).limit(10).forEach(Methods::yazInteger);
        }


    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim
    public static void yirmibirdenBaslaYediKatıİlkYirmiTerim(int x) {

        System.out.println(IntStream.iterate(21, t -> t + 7).limit(20).sum());
    }
}
     //iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
     //iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
     // limit() ile belilioruz