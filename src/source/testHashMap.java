/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.util.*;

/**
 *
 * @author YNZ
 */
public class testHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final Map myMap = new HashMap();
        myMap.put('1', 1);
        myMap.put('2', 2);
        myMap.put('3', 3);
        myMap.put(Float.toString(4.4f), 4);

        System.out.println(Float.toString(3.2f));
        System.out.println(myMap.toString());

        int[] myNum = new int[10];
        
        for (int i = 0; i < myNum.length; i++) {
            myNum[i] = i;
        }

        Set mySet;
        mySet = new HashSet();
        for(int i=0;i<myNum.length;i++){
            mySet.add(i);
        }
        System.out.println("set size=" +mySet.size());
        System.out.println("set to str=" +mySet.toString() );
        ArrayList myList = new ArrayList(mySet);
        System.out.println(myList.toString());
        
        

    }

}
