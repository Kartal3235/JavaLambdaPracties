package lambdaPractise;
//multi arrayleri cevirirken flapMap kullaniriz yapilis sekli iki turludur
//1) lamda kullanarak
// Arrays.stream(arr).flatMap(t->Arrays.stream(t))
//2) method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc","Erik"}
        };

        tumElListYap(arr);
        System.out.println("\n****");
        eİleBaslynElDoubYazdır(arr);
        System.out.println("\n****");
        eİleBaslynElDoubListYazdır(arr);
        System.out.println("\n****");
        kİleBtnSonunaYıldız(arr);
    }
    // S1 : tum elemanlari list yapayim
    public static void tumElListYap(String [][]arr){
        System.out.println(Arrays.stream(arr).flatMap(Arrays::stream).collect(Collectors.toList()));
    }


    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim
    public static void eİleBaslynElDoubYazdır(String [][]arr){

        Arrays.stream(arr).flatMap(Arrays::stream).filter(t -> t.startsWith("E")).map(t -> t + t).forEach(System.out::print);
    }


    // S3: E ile baslayan elemanlari liste olarak yazdiralim
    public static void eİleBaslynElDoubListYazdır(String [][]arr){

        System.out.println(Arrays.stream(arr).flatMap(Arrays::stream).filter(t -> t.startsWith("E")).map(t -> t + t).collect(Collectors.toList()));
    }


    //S4 : k ile bitenlerin sonuna '*' ekleyelim
    public static void kİleBtnSonunaYıldız(String [][]arr){

        System.out.println(Arrays.stream(arr).flatMap(Arrays::stream).filter(t -> t.endsWith("k")).map(t -> t + "*").collect(Collectors.toList()));
    }

}
