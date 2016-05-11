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
public class InvokeSuperNonArguConstuctor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        
        System.out.println(((Animal)cat).size);
        //System.out.println(cat.size); shadow fields by the subclass, using the same identifier.
        System.out.println(""+cat.x);  
        
        
        
        
        if( cat instanceof Flyer) System.out.println("cat is a flyer");
        if( cat instanceof Animal) System.out.println("cat is an animal");
    }
}
