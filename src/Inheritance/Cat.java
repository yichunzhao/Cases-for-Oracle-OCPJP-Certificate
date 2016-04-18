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
public class Cat extends Animal {

    //for the class method, it is not allowed to use @override annotation.
    //the class method in the super class, will be hidden here. 
    public static int ClassFld = 20; //hiding a class flied is not recommended, for it is code reading reason. 

    public static void testClassMethod() {
        System.out.println("static method from cat");
    }

    public void testSuperClass() {
        super.testInstanceMethod();//from animal
        Animal.testClassMethod();//from animal
        this.testInstanceMethod();//from cat
        System.out.println("animal flds " + Animal.ClassFld); //10
        System.out.println("cat flds " + Cat.ClassFld);//20
    }

    //instance method can be overriden explicitly. 
    @Override
    public void testInstanceMethod() {
        System.out.println("instance method from cat");
    }

}
