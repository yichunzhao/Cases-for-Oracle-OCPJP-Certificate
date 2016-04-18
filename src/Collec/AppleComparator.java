/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collec;

import java.util.Comparator;

/**
 *
 * @author YNZ
 */
public class AppleComparator implements Comparator<Apple>{

    @Override
    public int compare(Apple a1, Apple a2) {
        return Float.compare(a1.getSize(), a2.getSize());
    }

    
}
