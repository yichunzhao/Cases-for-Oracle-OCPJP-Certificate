/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun;

import java.util.*;

/**
 *
 * @author YNZ
 */
public class SameKeyDiffHashCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Number, String> map = new HashMap<>();
        map.put(1d, "this is one");
        map.put(1d, "this is two");
        map.put(2d, "hellow world");
        map.put(3d, "we are here!");
        map.put(10d, "this is one");
        map.put(9d, "this is two");
        map.put(8d, "hellow world");
        map.put(7d, "we are here!");

        Set<Number> keys = map.keySet();
        for (Number n : keys) {
            System.out.println(n + " " + map.get(n));
        }
        /**
         * *******************
         * this is two hellow world we are here! *******************
         */

        System.out.println("------------------------------------------");

        //the value is overlapped as using the same key. 
        //however, it won't give compiling error or runtime exceptions. 
        Map<Number, String> map0 = new Hashtable<>();
        map0.put(1d, "this is one");
        map0.put(1d, "this is two");
        map0.put(2d, "hellow world");
        map0.put(3d, "we are here!");
        map0.put(10d, "this is one");
        map0.put(9d, "this is two");
        map0.put(8d, "hellow world");
        map0.put(7d, "we are here!");
        
        Set<Number> keys_ = map0.keySet();
        System.out.println(keys_);
        for (Number number : keys_) {
            System.out.println(number + " " + map0.get(number));

        }

        /**
         * hashtable return keyset in a reversed seq. 3.0 we are here! 2.0
         * hellow world 1.0 this is two
         */
    }

}
