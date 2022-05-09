package lambdaPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        
        System.out.println("******");
        bosBırPrint(list);
        System.out.println("\n******");
        negatifPrint(list);
        System.out.println("\n******");
        pztList(list);
        System.out.println("\n******");
        listElKaYnListOlstr(list);
        System.out.println("\n******");
        listElKarTekrsızYenList(list);
        System.out.println("\n******");
        listElKckBykSrl(list);
        System.out.println("\n******");
        listElBykKckSrl(list);
        System.out.println("\n******");
        listPzKpBrlBs5OlanYeniList(list);
        System.out.println("\n******");
        listPzKrBrlBs5OlanYeniList(list);
        System.out.println("\n******");
        listElTop(list);
        System.out.println("\n******");
        negatfKareList(list);
        System.out.println("\n******");
        list5BykVarMİ(list);
        System.out.println("\n******");
        boolean kontrol = false;
        System.out.println(kontrol);
        System.out.println("\n******");
        listElSıfKckMu(list);
        System.out.println("\n******");
        list100EstELVarMı(list);
        System.out.println("\n******");
        list0EstElVarMı(list);
        System.out.println("\n******");
        listİlk5ElTopl(list);
        System.out.println("\n******");
        listSon5ElTopl(list);
        System.out.println("\n******");

    }

    // S1:listi aralarinda bosluk birakarak yazdiriniz //
    public static void bosBırPrint(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " "));
    }


    //S2: sadece negatif olanlari yazdir

    public static void negatifPrint(List<Integer> list) {
        list.stream().filter(t -> t < 0).forEach(t -> System.out.print(t + " "));
    }

    //S3: pozitif olanlardan yeni bir liste olustur

    public static void pztList(List<Integer> list) {

        System.out.println(list.stream().filter(t -> t > 0).collect(Collectors.toList()));
    }


    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
    public static void listElKaYnListOlstr(List<Integer> list) {

        System.out.println(list.stream().map(t -> t * t).collect(Collectors.toList()));
    }


    //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim

    public static void listElKarTekrsızYenList(List<Integer> list) {

        System.out.println(list.stream().map(t -> t * t).distinct().collect(Collectors.toList()));
    }

    //S6: listin elemanlarini kucukten buyuge siralayalim
    public static void listElKckBykSrl(List<Integer> list) {

        list.stream().sorted().forEach(t -> System.out.print(t + " "));
    }


    //S7: listin elemanlarini buyukten kucuge siralayalim

    public static void listElBykKckSrl(List<Integer> list) {

        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }

    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    public static void listPzKpBrlBs5OlanYeniList(List<Integer> list) {

        System.out.println(list.stream().map(t -> (t * t * t)).filter(t -> t > 0 && t % 10 == 5).collect(Collectors.toList()));
    }


    //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
    public static void listPzKrBrlBs5OlanYeniList(List<Integer> list) {

        System.out.println(list.stream().filter(t -> t > 0 && t % 10 != 5).map(t -> t * t).collect(Collectors.toList()));
    }


    // S10 :list elemanlarini toplamini bulalim
    public static void listElTop(List<Integer> list) {

        System.out.println(list.stream().reduce(Integer::sum));
    }


    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
    public static void negatfKareList(List<Integer> list) {


    }


    // S12 : listeden 5 den buyuk  sayi var mi?

    public static void list5BykVarMİ(List<Integer> list) {

        System.out.println(list.stream().anyMatch(t -> t > 5) ? "5 den büyük sayı vardır" : "5 den küçük sayı yoktur.");

    }

    public static boolean list5BykVar(List<Integer> list) {

        boolean kontrol = list.stream().anyMatch(t -> t > 5);

        return kontrol;
    }


    // S13 : listenin tum elemanlari sifirdan kucuk mu?
    public static void listElSıfKckMu(List<Integer> list) {

        System.out.println(list.stream().allMatch(t -> t < 0) ? "Tüm elemanlar 0 dan küçüktür" : " 0 dan büyük eleman vardır.");

    }


    // S14: listenin 100 e esit elemani yok mu ?
    public static void list100EstELVarMı(List<Integer> list) {

        System.out.println(list.stream().allMatch(t -> t != 100) ? "yoktur" : "vardır ");

    }

    // S15: listenin sifira esit elemani yok mu?
    public static void list0EstElVarMı(List<Integer> list) {

        System.out.println(list.stream().allMatch(t -> t != 0) ? "yoktur" : "vardır ");

    }

    // S16:  listenin ilk 5 elemanini topla?
    public static void listİlk5ElTopl(List<Integer> list) {

        System.out.println(list.stream().limit(5).reduce(Integer::sum));

    }



    //S17: listenin son bes elemaninin  listele
    public static void listSon5ElTopl(List<Integer> list) {

        System.out.println(list.stream().skip(list.size()-5).collect(Collectors.toList()));

    }

}
