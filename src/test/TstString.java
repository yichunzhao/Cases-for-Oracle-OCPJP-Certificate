/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author YNZ
 */
public class TstString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "ynz";
        String str2 = new String("ynz");
        String str3 = "ynz";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        
    }
    
}
