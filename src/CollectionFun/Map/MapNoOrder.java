/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun.Map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author YNZ
 */
public class MapNoOrder {

    public static void main(String[] args) {
        Map<String, Double> salaryMap = new HashMap<>();

        salaryMap.put("Paul", 32222.88);
        salaryMap.put("Smith", 43333.98);
        salaryMap.put("Chris", 45556.98);

        System.out.println(salaryMap);

        //value can be replaced
        salaryMap.put("Paul", 9999.00);
        salaryMap.put(null, 30.00);
        System.out.println(salaryMap);

    }

}
