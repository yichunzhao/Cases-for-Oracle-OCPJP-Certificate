/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author YNZ
 */
public class AddAllClear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<StringBuilder> al = new ArrayList<>();
        al.add(new StringBuilder("dell"));
        al.add(new StringBuilder("lenovo"));
        
        ArrayList<StringBuilder> ml = new ArrayList<>();
        ml.add(new StringBuilder("IBM"));
        ml.add(new StringBuilder("apple"));
        StringBuilder one = new StringBuilder("one");
        ml.add(one);
        //add all elements of ml at the end of al
        al.addAll(ml);
        System.out.println(""+al);    
        
        //ml not removed
        System.out.println(""+ml);    
        
        //change common element.
        one.append(one.length());
        System.out.println(""+al);    
        System.out.println(""+ml);    
        
        
    }

}
