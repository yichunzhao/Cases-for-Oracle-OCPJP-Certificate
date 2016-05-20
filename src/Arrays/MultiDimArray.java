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
public class MultiDimArray {

    int[] a[] = {{1, 2, 3}, {4, 5, 6}};
    int[][] b = {{7, 8, 9}, {10, 11, 12}, {10, 11, 12}};

    int[] c = new int[3];
    int[] d[] = new int[3][4];

    Random r = new Random(1000);

    {
        for (int[] d1 : d) {
            for (int j = 0; j < d1.length; j++) {
                d1[j] = r.nextInt(200);
            }
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = i;
        }
    }

    public static void main(String[] args) {
        MultiDimArray mda = new MultiDimArray();
        System.out.println("c= " + Arrays.toString(mda.c));
        System.out.println("d=");
        for (int[] d1 : mda.d) {
            System.out.println(Arrays.toString(d1));
        }

    }

}
