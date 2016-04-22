/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author YNZ
 */
public class HeapPollution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        List<Number> ls = list;

        try {
            ls.add(new Integer("dd"));
        } catch (Exception e) {
            System.out.println("exception");
            System.out.println(e.toString());
        }

        System.out.println(Integer.parseInt("11", 16));//converting 16 into decimal
        System.out.println(Integer.toString(11, 16).toUpperCase());//converting decimal into Hex, using toString()
        
        
    }

}
