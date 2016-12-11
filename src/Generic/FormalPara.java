/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author YNZ
 */
public class FormalPara {
    private List list;
    
    public void set(List<? extends Number> list){
        this.list = list; 
    }

    public static void main(String[] args) {
        Map<String, List> map = new HashMap<>();
        map.put("one", new ArrayList());

        List<Number> list = new ArrayList<>();
        list.add(11);
        
        Map<String,List> map1 = new HashMap<>(map);
        
        FormalPara formalPara = new FormalPara();
        formalPara.set(new ArrayList<Integer>());
       
    }
}
