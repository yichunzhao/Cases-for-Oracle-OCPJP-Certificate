/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun;

import java.util.HashMap;

/**
 *
 * @author YNZ
 */
public class CountOccurrenceOfWords {

    public static void main(String... args) {
        String text = "Have a good day. Have a good class. Have a good visit. have fun!";
        HashMap<String, Integer> hashMap = new HashMap();

        String[] words = text.split("[ .!]");
        for (String word : words) {
            System.out.print(" " + word);
        }
        
        System.out.println("");

        for (String s : words) {
            if (hashMap.keySet().contains(s)&s.length()>1) {
                int value = hashMap.get(s);

                hashMap.put(s, ++value);
            } else {
                hashMap.put(s, 1);
            }
        }

        System.out.println("" + hashMap);

    }

}
