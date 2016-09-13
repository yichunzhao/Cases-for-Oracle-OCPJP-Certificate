/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class CollectionSerch {

    private static final int size = 1000;
    private static List<Integer> list = new ArrayList<>();

    static {
        //Random r = new Random(500);
        for (int i = 0; i < size; i++) {
            boolean add = list.add(i);
        }
    }

    public static void main(String[] args) {
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, new Integer(1)));

    }

}
