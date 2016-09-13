/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun.Map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author YNZ
 */
public class HashMapDuplicatedEele {
    
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("key1", new Integer(10));
        map.put("key1", new Integer(20));
        
        System.out.println(map);
    }
    
}
