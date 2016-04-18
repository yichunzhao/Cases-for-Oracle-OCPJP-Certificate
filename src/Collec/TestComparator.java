/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collec;

import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @author YNZ
 */
public class TestComparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //associate a custome comparator.
        Set<Apple> set = new TreeSet<>(new AppleComparator());

        set.add(new Apple(1.2f));
        set.add(new Apple(4.3f));
        set.add(new Apple(2.5f));
        set.add(new Apple(0.9f));
        set.add(new Apple(3.5f));
                
        System.out.println("set = " +set);
    }
}
