/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class AryUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] strs = {"str1", "st2", "st3"};
        System.out.println("" + Arrays.asList(strs));
        List<String> list = Arrays.asList(strs);//non-argument 

        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            System.out.println("iterator.next()" + iterator.next());
        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println("iternator.next()" + it.next());
        }

        System.out.println("r =" + Arrays.binarySearch(strs, "st3")); //also can setup (start end) index
    }
}
