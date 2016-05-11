/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author YNZ
 */
public class SortMapBySet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<Number, String> map = new HashMap<>();
        map.put(1d, "this is one");
        map.put(13d, "this is two");
        map.put(2d, "hellow world");
        map.put(3d, "we are here!");
        map.put(10d, "this is one");
        map.put(9d, "this is two");
        map.put(8d, null);
        map.put(7d, null); // null values are allowed
        //map.put(null, "we are here!"); not allowing null key

        Set<Number> keys = map.keySet();
        SortedSet sortKeys = new TreeSet(keys);
        
        
        for (Number n : keys) {
            System.out.println(n + " " + map.get(n));
        }

    }

}
