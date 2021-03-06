package lambdaPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C3_Array_StreamOrnekleri {
    public static void main(String[] args) {

        // Arraylerde Stream kullanabilmek icin 2 yol vardir
            // 1) Stream <Integer> isim=StreamOf(cevrilecek olan) -> Stream objesi
            // 2) Arrays.stream(arr).  ->  Array sinifindan yararlanarak
        //Array ler collection sinifinda degillerdir..set ve MAp ler gibi degildir..
        // kullanabilmek icin donusum yapilmalidir

        Integer arr1 [] ={1,5,-5,6,12,-8,9,3,4};
       List<Integer>yenilist=new ArrayList<Integer>();
       yenilist.add(1);
       yenilist.add(5);
       yenilist.add(-5);
       yenilist.add(6);
       yenilist.add(12);
       yenilist.add(-8);
       yenilist.add(9);
       yenilist.add(3);
       yenilist.add(4);
        System.out.println(listele(arr1));
        System.out.println("\n******");

        System.out.println("\n******");
        ortalama(arr1);

    }
    //S1: arrayin elemanlarini bir liste yazdiralim

    public static List<Integer> listele(Integer[]arr){
        return Arrays.stream(arr).collect(Collectors.toList());
    }
    //S2: Arrayin elemanlarini toplamini bulalim



    // S3: Array in elemanlarinin ortalamasini bulalim yazdir

    public static void ortalama(Integer[] arr){
        System.out.println(Arrays.
                stream(arr).
                mapToDouble(t -> t).
                average());

    }





}
