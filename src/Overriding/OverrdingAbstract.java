/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author YNZ
 */

class Super{
    public Set getSet(int a){
        HashSet set = new HashSet();
        return set;
    }
}

abstract class Sub extends Super{
    abstract public Set get(int a);
   
}

class SubSub extends Sub{

    @Override
    public Set get(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


public class OverrdingAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         if (false) ; else;
    }
    
}
