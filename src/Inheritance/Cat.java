/*
 * hiding fields; if
 * 
 * 
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

    //int x = 20;
    static int y = 30;
    protected int c = 50;
    private int z;
    
    //@SuppressWarnins("FieldNameHidesFieldInSuperclass")
    private int size=30;

    public Cat() {
        this("cat");  //must at first line of constructor
        System.out.println("Cat constructor");
    }

    public Cat(String species) {
        super(species); // the same must be at the first line of constructor. 
    }

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

    @Override
    public void testInstanceMethod() {
        System.out.println("instance method from cat");
    }
    



}
