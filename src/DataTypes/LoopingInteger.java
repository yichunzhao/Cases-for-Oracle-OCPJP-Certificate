/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author YNZ
 */
public class LoopingInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int start = Integer.MAX_VALUE - 10;
        int end = Integer.MAX_VALUE;

        //2,147,483,647
        System.out.println("" + Integer.MAX_VALUE);
        System.out.println("start= " + start);
        System.out.println("end= " + end);
        HashSet<Number> set = new HashSet<>();
        TreeSet<Number> ts = new TreeSet<>();
        LinkedList<Number> ll = new LinkedList<>();
        ArrayList<Number> al = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            set.add(i);
            ts.add(i);
            ll.add(i);
            al.add(i);

            if (i == end) {
                break;
            }
        }

        System.out.println(set);//overflow
        System.out.println(ts);

        System.out.println(ll);
        System.out.println(al);

        Number[] x = new Integer[end - start + 1];
        x = al.toArray(x);

        for (Number e : x) {
            System.out.print(e + " ");
        }

        System.out.println("\n");

        Object[] os = al.toArray();
        for (Object o : os) {
            System.out.print(" " + o);
        }
        System.out.println("\n");
    }

}
