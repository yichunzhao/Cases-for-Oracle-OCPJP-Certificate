/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author YNZ
 */
public class UsingMapGenerics {

    public static void main(String[] args) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        map.put("one", new ArrayList<Integer>());

    }
}
