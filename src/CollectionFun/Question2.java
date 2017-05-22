/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author YNZ
 */
public class Question2 {

    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        coll.add("Fred");
        coll.add("Jim");
        coll.add("Sheila");
        System.out.println("coll is " + coll);

        if (coll.contains("Fred")) {
            coll.remove("Fred");
        }
        System.out.println("coll is " + coll);

    }

}
