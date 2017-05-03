/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author YNZ
 */
public class CollectionInterface {
    
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Iterable i = new HashSet();
        Iterable container = c;
        Random r = new Random(10);
        if(container instanceof Iterable) System.out.println("true");
        if(container instanceof Collection) System.out.println("true");
    }
    
}
