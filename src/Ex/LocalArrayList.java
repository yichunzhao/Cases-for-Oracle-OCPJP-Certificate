/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

import java.util.ArrayList;

/**
 *
 * @author YNZ
 */
public class LocalArrayList {
    
    public static void main(String... vars){
        //local var. must be init. before using it
        ArrayList<Integer> al = null;
        al= new ArrayList<>();
        al.add(2);
        System.out.println(""+al);
        
        Float.parseFloat("12");
        
    }
    
}
