package lambdaPractise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C2_StringList_StreamOrnekleri {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");

        ilkHarfdVeyaCOlanLis(list);
        System.out.println("\n*****");

        System.out.println("\n*****");
        alfSıralaList(list);
        System.out.println("\n*****");
        tumLleriSilme(list);
        System.out.println("\n*****");
        icindeEOlanYeniList(list);
        System.out.println("\n*****");
        ilkHarf3KerTekrarYazdır(list);


    }
    // S1: ilk harfi d ve ya c olanlari listeleyelim
    public static void ilkHarfdVeyaCOlanLis(List<String> list){
        System.out.println(list.stream().filter(t->t.toString().toLowerCase().charAt(0)=='d'||t.toString().toLowerCase().charAt(0)=='c').collect(Collectors.toList()));
    }


    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim


    //S3: alfabedik  gore siralayalim list olarak
public static void alfSıralaList(List<String> list){

    System.out.println(list.stream().map(String::toLowerCase).sorted().collect(Collectors.toList()));
}

    //S4: tum 'l' leri silelim yazdiralim

    public static void tumLleriSilme(List<String> list){
        System.out.println(list.stream().map(t -> t.toLowerCase().replaceAll("l", "")).collect(Collectors.toList()));
    }

    //S5 : icinde e olanlardan yeni bir list olusturunuz

    public static void icindeEOlanYeniList(List<String> list){

        System.out.println(list.stream().map(t -> t.replace("e", "")).collect(Collectors.toList()));
    }

    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi

        public static void ilkHarf3KerTekrarYazdır(List<String> list){


        }


    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz



    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz



}
