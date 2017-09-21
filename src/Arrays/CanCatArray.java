/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class CanCatArray {
    public static void main(String[] args) {
        
        int[] a = {1,2,3};
        Integer[] b = new Integer[4];
        
        //int[] b = new int[4];
        Arrays.asList(0, a).toArray(b);
        
        System.out.println(""+ b);
        
        
    }
    
}
