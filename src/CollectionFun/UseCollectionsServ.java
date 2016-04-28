/*
 * java.util.collection
 */
package CollectionFun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author YNZ
 */
public class UseCollectionsServ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();

        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();

        List<Integer> list1 = new ArrayList();
        for (int i = 0; i < 20; i++) {
            int rand = r.nextInt(30);
            set1.add(rand);

            list1.add(rand);
        }

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("list1" + list1);
        Set<Integer> set3 = new TreeSet<>(list1);
        System.out.println("set3" + set3);

        Set<Integer> set4 = new HashSet(list1);
        System.out.println("set4" + set4);
        //java util service methods, for collections
        System.out.println("list1" + list1);
        int idx = Collections.binarySearch(list1, 27);
        System.out.println("idx = "+idx);
        
        Collections.sort(list1);

        

    }

}
