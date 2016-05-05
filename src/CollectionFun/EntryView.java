/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author YNZ
 */
public class EntryView {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Number, String> map = new HashMap<>();
        map.put(1, "this is ");
        map.put(2, "anything possible");
        map.put(2, "whatever it could be");

        Set set = map.entrySet();
        Set keySet = map.keySet();

        System.out.println(keySet);
        
        System.out.println("Magasin, Kgs Nytor 96433".toLowerCase().contains("magasin"));
        System.out.println("magasin".toLowerCase().contains("Magasin, Kgs Nytor 96433"));
        

    }

}
