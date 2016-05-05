/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author YNZ
 */
public class IndexOfSubList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> src = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            src.add(new Double(i));
        }
        
        ArrayList<Double> target = new ArrayList<>();
        
        for (int j=3; j<10;j++){
            target.add(new Double(j));
        }
        
        int firstPos = Collections.indexOfSubList(src, target);
        System.out.println("firt pos " + firstPos);
        
        

    }

}
