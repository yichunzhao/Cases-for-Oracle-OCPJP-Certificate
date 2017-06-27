/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YNZ
 */
interface CanGenericInteface<T extends Number> {
    boolean addElement(T t);
}

class Cube implements CanGenericInteface<Long>{

    @Override
    public boolean addElement(Long t) {
        List<Long> cube = new ArrayList<>();
        return cube.add(t);
    }
    
}



