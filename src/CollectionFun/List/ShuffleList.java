/*
 * Hashset, TreeSet contains a sorting process. so it won't keep the order of 
 * elements as they are inserted. 
 * Linked hashset, ArrayList LinkedList keeping the order.
 * then why linked hashset must keeping the order as list? it needs a set while keeping the order.
 */
package CollectionFun.List;

import java.util.*;

/**
 *
 * @author YNZ
 */
public class ShuffleList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        
        //shuffle the list
        Collections.shuffle(list);
        System.out.println("after shhffle "+list);
        
        //creating a hashset, hasheset contains a sorting process
        Set<Integer> mySet = new HashSet<>(list);
        System.out.println(mySet);
        
        //tree set,contains a sorting process
        Set<Integer> set2 = new TreeSet<>(list);
        System.out.println(set2);
        
        //linked hashset, has no sorting process
        Set<Integer> set3 = new LinkedHashSet<>(list);
        System.out.println(set3);
        
        //arraylist , has no sorting process
        List<Integer> list1 = new ArrayList<>(list);
        System.out.println(list1);
        
        //linked list has no sorting process
        List<Integer> list2 = new LinkedList<>(list);
        System.out.println(list2);

    }

}
