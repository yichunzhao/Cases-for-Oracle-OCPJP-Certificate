/*
 * need to warch out the ArrayIndexOutofBoundsExceoption
 * index starting from 0, ... n-1* To change this license header, choose License Headers in Project Properties.
 */
package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author YNZ
 */
public class arycopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int[] a1 = new int[20];
        int[] a2 = new int[20];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = r.nextInt(99);
        }
        
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

        System.arraycopy(a2, 2, a1, 4, 2);
        for (int e : a1) {
            System.out.print(e+ " ");
        }
    }
}
