/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 *
 * @author YNZ
 */
public class IsA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat(); //Cat is a Animal; Animal is not a cat. 
        System.out.println(cat instanceof Animal); //Is-A
        System.out.println(animal instanceof Cat);
        System.out.println(cat instanceof Object);
        System.out.println(cat instanceof Countable);
        System.out.println(animal instanceof Countable);

        animal = (Animal)(Countable)cat; //correct
        System.out.println(""+animal.toString());
        
        
        ListSaver listSaver = new ListSaver();
        //cat = (Cat) (Countable) animal;  Animal is not a Cat
        //System.out.println(""+cat.toString());
        Collection c = new ArrayList(); //if it is a Collection then it must be a List
        System.out.println(c instanceof List); //true 
        
        //the following will generate a compiling error, incomptable types. 
        //listSaver.saveObject(c);//method accept List variable, but c has been declared as Collection, which beyound the type boundary. 
        
        assert c instanceof Collection;
        assert c instanceof ArrayList;
        

    }

}
