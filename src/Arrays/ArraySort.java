/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author YNZ
 */
public class ArraySort {

    private static final int len = 30;
    private static int[] a;

    static {
        Random r = new Random();
        a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = r.nextInt(1000);
        }

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
        
        

    }

}
