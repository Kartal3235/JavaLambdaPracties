package lambdaPractise;

// lambda da method kullanimi :
//ilk olarak class adi yazilir
//sonra  :: noktalar konur
//son olarak method secilir
//String class i sayesinde length gibi touppercase gibi methodlari kullanabiliriz
//Math classi sayesinde de sum vb methodlar kullanabiliriz

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> intL= Arrays.asList(-2,-8,-5,2,0,5,6,7,15,6,8);

        tekleriBoşlkBrkYazdır( intL);
        System.out.println("\n****");
        ciftCarpBulma(intL);
        System.out.println("\n****");
        negatifKareToplamı(intL);
        System.out.println("\n****");
        poztfKupMaxPrint(intL);
    }
    // S1: tekleri aralarinda bir bosluk birakarak yazdiralim
    public static void tekleriBoşlkBrkYazdır(List<Integer> intL){

        intL.stream().filter(t->t%2!=0).forEach(t-> System.out.print(t+" "));
    }


    // S2: ciftlein carpimini bulalim
    public static void ciftCarpBulma(List<Integer> intL){

        System.out.println(intL.stream().filter(t -> t % 2 == 0).reduce(Math::multiplyExact));
    }

    // S3: negatiflerin kare toplamlarini  bulalim

    public static void negatifKareToplamı(List<Integer> intL){

        //System.out.println(intL.stream().filter(t -> t < 0).map(t -> t * t).reduce(Integer::sum));

        System.out.println(intL.stream().filter(t -> t<0).reduce(0, (u, t) -> (t*t)+ u));
    }


    // S4: poziflerin kuplerinden max yazdiralim

    public static void poztfKupMaxPrint(List<Integer> intL){

        System.out.println(intL.stream().filter(t -> t > 0).mapToInt(t->t*t*t).max());
    }


}
