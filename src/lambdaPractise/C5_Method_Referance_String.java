package lambdaPractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C5_Method_Referance_String {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");

        tumHarfBykHrfArBosPrint(l);
        System.out.println("\n*****");
        stringUzunGöreSıralaPrint(l);
        System.out.println("\n*****");
        eİleBaslynPrint(l);
    }
    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
    public static void tumHarfBykHrfArBosPrint(List<String> l){

        //l.stream().map(String::toUpperCase).forEach(t->System.out.print(t+" "));
        System.out.println(l.stream().
                map(String::toUpperCase).
                map(t -> t.split("")).
                flatMap(Arrays::stream).//
                collect(Collectors.toList()));
    }

    //S2: Stringleri uzunluklarina gore siralayip yaziniz

    public static void stringUzunGöreSıralaPrint(List<String> l){

        l.stream().map(t->t.length()).sorted().forEach(t->System.out.print(t+" "));
        //l.stream().
        //        sorted(Comparator.comparing(String::length)).
        //        forEach(Methods::yazString);
    }

    //S3: E ILE Baslayanlari yazdiralim
    public static void eİleBaslynPrint(List<String> l){
        l.stream().filter(t->t.startsWith("E")).forEach(t->System.out.print(t+" "));
    }

}
