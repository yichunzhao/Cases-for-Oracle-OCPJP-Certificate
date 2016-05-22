/*
 * array is a subclass of Object.
 * pass by value, as passing to the method.  
 * 1) change may made by the passed reference(value) within the method.  
 * 2) but cannot point the reference(value) to a new reference within the method
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class AryIsObj {

    public static void changeIt(int[] a) {
        if (a == null) {
            throw new NullPointerException();
        }
        if (a.length > 1) {
            a[0] = 999;
        }
    }

    public static void pointToNewObj(int[] a) {
        if (a == null) {
            throw new NullPointerException();
        }

        int[] b = {4, 5, 6, 7};
        a = b;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};

        System.out.println("array is Object? " + a instanceof Object);
        System.out.println("" + a.toString()); //inherite toString from Object class. 

        //traverse by for...loop
        for (int e : a) {
            System.out.print(e + " ");
        }

        System.out.println("\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\n");
        //compareing two array.
        System.out.println("a equal b " + a.equals(b)); //Object.equal method, compare the refercen equality. 
        System.out.println("a equal b " + Arrays.equals(a, b));

        //change array in the method. 
        changeIt(a);
        System.out.println("after changeit " + Arrays.toString(a));
        
        pointToNewObj(a);
        System.out.println("after point to " + Arrays.toString(a));

    }

}
