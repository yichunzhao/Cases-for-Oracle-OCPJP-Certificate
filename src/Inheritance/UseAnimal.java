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
public class UseAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Animal cat = new Cat();
        System.out.println(" "+cat.c +" "+cat.x);
        
        System.out.println(Cat.y);
        System.out.println(new Animal().x);
        
        Object obj = new Object();   
        obj.equals(obj);
        
        
    }
}
