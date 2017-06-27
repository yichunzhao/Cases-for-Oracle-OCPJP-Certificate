/*
 * When forgetting diamond <>, what will happend?
 * Compilier will treat it as a raw type.(it could put any objects there.  
 *  Actually compilier treat the formal type as objects. 
 */
package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class Diamond {

    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("forgetting diamond");
        list.add("ddd");

        Pair<String, Integer> p = new Pair("string", "list");
        p.getT1();

        List<Number> list1 = new ArrayList<>();
        boolean add = list1.add(10);

        List<? extends Number> numList = new ArrayList<>();
        //numList = new ArrayList<Double>();
        
       
        
    }

}
