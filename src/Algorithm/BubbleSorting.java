/*
 * Bubble Sorting
 * 
 * 
 */
package Algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author YNZ
 */
class Numbers {

    private int[] nums;
    private Random r;
    private int size;

    public Numbers(int size) {
        nums = new int[size];
        r = new Random();
        this.size = size;
    }

    public int[] generate() {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(size);
        }
        return nums;
    }
}

class Sorter {

    public static void bubbleSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int tmp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = tmp;
            }
        }
        
        for (int i = a.length-1; i > 0; i--) {
            if (a[i-1] > a[i]) {
                int tmp = a[i-1];
                a[i-1] = a[i];
                a[i] = tmp;
            }
        }
        

    }
}

public class BubbleSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Numbers n = new Numbers(15);
        //int[] a = n.generate();
        int[] a = {3, 0, 1, 7, 13, 6, 4, 14 };
        System.out.println(Arrays.toString(a));
        Sorter.bubbleSort(a);
        System.out.println(Arrays.toString(a));

    }
}
