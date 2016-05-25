/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author YNZ
 */




public class Dynmics {
    
    public static void main(String[] args) {
        Object o = 10;
        Number n = 20;
        Integer p = 30;
        Number q = p;
        Integer m = (Integer)n;
        Integer x   = (Integer)o;
        
        System.out.println("o simple name: "+o.getClass().getSimpleName()+ " type name "+ o.getClass().getTypeName());
        System.out.println("o simple name: "+n.getClass().getSimpleName()+ " type name "+ n.getClass().getTypeName());
        System.out.println("o simple name: "+p.getClass().getSimpleName()+ " type name "+ p.getClass().getTypeName());
        System.out.println("o simple name: "+q.getClass().getSimpleName()+ " type name "+ q.getClass().getTypeName());
        System.out.println("o simple name: "+q.getClass().getSimpleName()+ " type name "+ q.getClass().getTypeName() );
        System.out.println("o simple name:" + m.getClass().getSimpleName()+ " type name "+ m.getClass().getTypeName());
        
    }
    
}


