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
        Cat cat = new Cat();
        Animal animal = new Animal();
        cat.testInstanceMethod();//from cat
        animal.testInstanceMethod();//from animal
        Cat.testClassMethod();//from cat
        Animal.testClassMethod();//from animal
        System.out.println("cat static var ="+Cat.ClassFld);
        System.out.println("animal static var="+Animal.ClassFld);
        System.out.println("-------++++++++++++");
        cat.testSuperClass();
        
        System.out.println("--if class method is not hidden ");
        Animal.testClassMethod1();
        Cat.testClassMethod1();//method is not hidden from the sub-class. both share the same class method from the animal. 
        
        System.out.println("--if instance method is not overriden ");
        animal.testInstanceMethod1();
        cat.testInstanceMethod1();//both share from the animal
        
        
        
    }
}
