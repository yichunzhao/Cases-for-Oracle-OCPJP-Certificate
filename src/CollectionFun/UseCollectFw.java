/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class UseCollectFw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> colors = Arrays.asList("red","green","blue");

        List list = new ArrayList(); //by default initial capacity = 10; 
        Set<Integer> set = new HashSet(); //non-sorted set; set is not allowed duplicated elements
        Set<Integer> set1 = new HashSet((int) 0.2);
        SortedSet<Integer> set2 = new TreeSet();//sorted set. 
        Set<Integer> linkedSet = new LinkedHashSet();

        Integer a1 = new Integer(10);

        Comparator c = set2.comparator(); //comparator could be associated externally
        if (c != null) {
            System.out.println(" comparator " + c.compare(new Integer(1), new Integer(2)));
        }
        //by default using elements compareTo to sorting
        System.out.println("a1<20 =" + a1.compareTo(20));

        Map map = new HashMap(); //empty collection of a map. 

        map.put("min", 0);
        map.put("max", 20);
        map.put(null, 30); //allowing null key value in a map. 
        System.out.println("map " + map);

        int min = (Integer) map.get("min");
        System.out.println("min = " + min);

        map.remove("min"); //remove an element by its key
        map.remove("max");

        Collection list1 = new ArrayList(); //list allow duplicated list
        System.out.println("list1 hashcode " + list1.hashCode());
        list1.add(set); //coverting a list into a set, removign dupicated elem. 
        System.out.println("list1 hashcode " + list1.hashCode());

        Date d = new Date();
        System.out.println(d);
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int rand = r.nextInt(100);
            map.put(i, rand);
            set.add(rand);
            linkedSet.add(rand);
        }
        //sorting set in a tree set; giving a better performance in this way
        //only one sort process involved. 
        set2.addAll(set);

        System.out.println("r=" + map.entrySet());
        System.out.println("r key set =" + map.keySet());
        System.out.println("r values =" + map.values());

        System.out.println("set size=" + set.size());
        System.out.println("rand set=" + set);
        System.out.println("sorted set size =" + set.size());
        System.out.println("sorted set=" + set2);
        System.out.println("first element " + set2.first() + " last element = "+ set2.last());

        for (Iterator it = set.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        System.out.println("++++++++++++++++++++++++");

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        for (Object element : set) {
            System.out.print(element.toString()+" ");
        }
    }

}
