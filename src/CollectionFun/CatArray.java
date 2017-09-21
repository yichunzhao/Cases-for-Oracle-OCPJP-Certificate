/*
 * how to cat two array together by Arrays.asList? is this possible? 
 * it seems it is not possible. 
 */
package CollectionFun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class CatArray {

    public static void main(String[] args) {
        Integer[] a = {2, 5, 6, 8};
        Integer[] b = {9, 12, 34};

        List<Integer[]> r = Arrays.asList(a, b);
        System.out.println("size : " + r.size());

        //please note
        //it contains two Integer array inside the List.
        // Arrays.asList(T....a)
        // return a fixed size list
        List<Integer> tmp = new ArrayList();
        tmp.addAll(Arrays.asList(a));
        tmp.addAll(Arrays.asList(b));

        tmp.stream().forEach(e -> {
            System.out.print(e + " ");
        });

        System.out.println("");

    }
}
