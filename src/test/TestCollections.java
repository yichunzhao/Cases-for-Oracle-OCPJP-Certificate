/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author YNZ
 */
public class TestCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List myList = new ArrayList('c');
        myList.add('d');
        myList.add('e');
        System.out.println(myList.toString());
        System.out.println(myList.hashCode());
        
        
                
    }
    
}
