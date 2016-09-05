/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun.SetFun;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @author YNZ
 */
public class SetEleSequence {

    public static void main(String[] args) {
        //HashSet sorted by the Hashcode
        Set<String> mySet = new HashSet<>();
        mySet.add("bgg");
        mySet.add("b");
        mySet.add("c");
        System.out.println("" + mySet.toString());
        
        //TreeSet implement Comparable interface: 
        //tree set implements 
        Set<String> mySet1 = new TreeSet<>();
        mySet1.add("bgg");
        mySet1.add("c");
        mySet1.add("d");
        mySet1.add("a");
        mySet1.add("b");
        System.out.println("" + mySet1.toString());
        
        Map<String, Integer> map = new HashMap<>();
        map.put("bgg", 1);
        map.put("b", 1);
        map.put("c", 2);
        System.out.println(map);
        
        
    }
}
