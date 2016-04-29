/*
 * Arrays.asList(5, 6, 7, 8) return a specific fixed size array. So you add 
 * element in it. 
 * 
 */
package Arrays;

import java.util.*;

/**
 *
 * @author YNZ
 */
public class AsListFixedSize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> alist = Arrays.asList(1, 2, 3, 4);
        List<Integer> blist = new ArrayList<>(alist);
        blist.add(120);
        alist = blist;

        System.out.println(alist);
    }

}
