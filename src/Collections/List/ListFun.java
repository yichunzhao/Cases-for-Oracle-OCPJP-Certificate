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
public class ListFun {
    
    public static void main(String[] args) {
        String str = "Spil Med og vind 1000 kr mens du støtter kræftsagen";
        String[] strs = str.split(" ");
        
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(strs));
        System.out.println(""+list.size());
        System.out.println(""+list);
        
        System.out.println("" + Arrays.asList(strs).size());
        
        String word = "million";
        List<Character> charList = new ArrayList(Arrays.asList(word.toCharArray()));
        System.out.println("size charList = " + charList.size());
        
        
                
    }
    
}
