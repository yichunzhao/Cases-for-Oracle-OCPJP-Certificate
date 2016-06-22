/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author YNZ
 */
public class EJavaGuruArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] arr1;
        int[] arr2 = new int[3];
        int[] arr3 = {'a', 'b'};
        arr1 = arr2;
        arr1 = arr3;
        System.out.println(arr1[0] + ":" + arr1[1]);
    }

}
