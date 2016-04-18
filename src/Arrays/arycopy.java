/*
 * need to warch out the ArrayIndexOutofBoundsExceoption
 * index starting from 0, ... n-1* To change this license header, choose License Headers in Project Properties.
 */
package Arrays;

/**
 *
 * @author YNZ
 */
public class arycopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {0,0,0,0,0,0};
        System.arraycopy(a2, 2, a1, 4, 2);
        for(int e:a1){
            System.out.print(e);
        }
    }
}
