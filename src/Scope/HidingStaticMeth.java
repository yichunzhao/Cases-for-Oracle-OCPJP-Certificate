/*
 * static method can be hidden by sub-class
 * instance method cannot override a static method in super-class
 * static variable can be hidden by sub-class.
 * class variable can be accessible from both from both class and instance
 */
package Scope;

/**
 *
 * @author YNZ
 */
class A {

    static boolean on;
    String me = "A";
    public int key = 0;

    static void getMe() {
        System.out.println("A");
    }

    public void showMe() {
        System.out.println("A");
    }
}

class B extends A {

    String me = "B";
    static boolean on = true;

    private int key;

    B() {
        this.key = 1;
    }

    static void getMe() {
        System.out.println("B");
    }

    public int getKey() {
        return this.key;
    }

    @Override
    public void showMe() {
        System.out.println("B");
    }
}

public class HidingStaticMeth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        B b1 = new B();

        System.out.println("A.on " + A.on);
        System.out.println("B,on " + B.on);

        //class var. can be accessed from instance and class. 
        System.out.println("a.on " + a.on);
        System.out.println("b.on " + b.on);

        //class method can be access directly by class name. 
        A.getMe();
        B.getMe();

        //instance method
        a.showMe();
        b.showMe();

        System.out.println("a.me " + a.me);
        System.out.println("b.me " + b.me);

        System.out.println("" + a.key);
        System.out.println("" + b.key);
        
        System.out.println(""+b1.getKey());

    }

}
