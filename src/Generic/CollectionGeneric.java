/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import Collec.Apple;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author YNZ
 */
public class CollectionGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, List<String>> myMap = new HashMap<>();
        Map myTable = new Hashtable();
        Set<Integer> mySet = new HashSet<>();
        Set<Integer> myTreeSet = new TreeSet<>();
        

        List<String> list = new ArrayList<>(); //without diamond; uncheck conversion warning. 
        list.add(Float.toString(1.2f));
        list.add(Float.toString(3.14f));
        list.add(Double.toString(2.12));
        list.addAll(list);
        list.add("A");
        
        List list1 = list;
        list1.add(new Apple(1.0f));
        
        //list.addAll(new ArrayList<>()); //addAll( Collection<? extends String>) variable type boundary
          list.addAll(new ArrayList(list));
        
        myMap.put("my map",list);
        
        //boolean(?) char(16) short(16) int(32) long(64) flat(32) double(64) primitive
        //int [] 
        //int [][]
        //enum; String. 

        myMap.put("10", list);
        myMap.put("11", list);  //but map is allowed to have null key. 

        myTable.putAll(myMap);  //table is not allowed to have null key. 
    }

}
