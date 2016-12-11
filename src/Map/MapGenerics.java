/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author YNZ
 */


public class MapGenerics {

    public static void main(String[] args) {
        Map<String, List<IceCream>> map = new HashMap<>();
        List<IceCream> list = new ArrayList<>();
        list.add(IceCream.CHOCOLATE);
        list.add(IceCream.STRAWBERRY);
        list.add(IceCream.WALNUT);
        map.put("one", list);
        map.put("two", new ArrayList<IceCream>());
    }
}
