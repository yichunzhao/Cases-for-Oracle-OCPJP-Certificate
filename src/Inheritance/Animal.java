/*
 * super-class non-argument constructor will be automatically invoked by the
 * sub-classes; if the sub-class has no explicitly invoke super(); which 
 * will be automatically inserted in the sub-class constructor. 
 */
package Inheritance;

/**
 *
 * @author YNZ
 */
public class Animal implements Countable{
    public static int ClassFld = 10;
    
    private String species;
    public int size =100;
    
    int x = 20;
    static int y = 30;
    protected int c = 50;
    private int z;

    public Animal() {
        //this();
        System.out.println("Animal constructor.");
    }

    public Animal(String species) {
        this.species = species;
    }
    
    public static void testClassMethod() {
        System.out.println("from animal");
    }

    public static void testClassMethod1() {
        System.out.println("class method from animal");
    }

    public void testInstanceMethod() {
        System.out.println("from animal");
    }

    public void testInstanceMethod1() {
        System.out.println("from animal");
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName(); //To change body of generated methods, choose Tools | Templates.
    }
    
     
}
