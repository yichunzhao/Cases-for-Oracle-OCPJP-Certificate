/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class ArrayToList {
    
    public static void main(String[] args) {
        String str = "Economist";
        List<char[]> charList = Arrays.asList(str.toCharArray());
        
        String str1 = "Deep and Crsip and even";
        String[] strs = str1.split(" ");
        List<String> strList = Arrays.asList(strs); //fixed sized list returned
        // strList.add("new element");  gives  UnsupportedOperationException
        
        List<String> nonFixedSizedList = new ArrayList<>(strList);
        List<String> nonFiexedSizedListA = new ArrayList<>();
        nonFiexedSizedListA.addAll(strList);
        
        System.out.println("nonFixedSizedList:  " + nonFixedSizedList);
        System.out.println("nonFiexedSizedListA:  "+ nonFiexedSizedListA);
        
        //then it becomes mutable. 
        nonFixedSizedList.add("new elment"); 
        System.out.println("nonFixedSizedList:  " + nonFixedSizedList);
        
    }
}
