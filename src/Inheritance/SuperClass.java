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
class SuperClass {
    public float a = 0.12f;

    static void superMethod() {
        System.out.println(SuperClass.class.getSimpleName());
    }
    
    static int size = 10;

    private void lowerMethod() {

    }

}

class SubClass extends SuperClass {
    private float a = 12.56f;
    static float size = 20;
    static void superMethod() {
        System.out.println(SubClass.class.getSimpleName());

    }

    //instance method cannot override class method. 
    
    //sub-class class method cannot hide the super-class instancec method.
    //private method cannot be inheritted, so it won't cause such an issue. 
    static void lowerMethod() {

    }
    
    public float getA(){
        return this.a;
    }
}

class AnotherSubClass extends SuperClass{
    
}

class Test {

    public static void main(String[] args) {
        SubClass.superMethod();
        SuperClass.superMethod();
        
        System.out.println(SubClass.size);
        System.out.println(new SubClass().getA());
        
        SuperClass sc = new SubClass();
        System.out.println(""+sc.a);
        
        SubClass subClass = new SubClass();
        System.out.println(""+subClass.getA() +" "+ ((SuperClass)subClass).a);
        //subClass.a for subclass type instance, a is hidden by the local private a variable. so you cannot access public a in the super class.
        //on this casee, you have to fully qualify it, by casting the sub-class into its super-class. 
        //in java pratice, when fields having the same name but different scope, the one in a higher scope is hidden by the one in the lower part. 
        
        //    
        System.out.println(Boolean.toString(subClass instanceof SuperClass)+"aha");
        System.out.println("how many interfaces " +SubClass.class.getInterfaces().length);
        
        
        
        

    }

}
