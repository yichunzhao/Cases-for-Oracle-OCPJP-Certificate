/*
 * Can a static method be overridden? No. 
 * Instance methods could be overridden, but not class method.
 * overriding is about on runtime, how the methods are dynamically selected. 

 * 
 */
package Inheritance;

/**
 *
 * @author YNZ
 */
class A {

    public static int id = 1;

    //private static String name = this.toString(); this statment is not valid, for this ref. to an instance. 
    public static void whoAmI() {
        System.out.println("A");
    }

    public void getInstance() {
        System.out.println(this.hashCode());
    }
}

class B extends A {

    public static int id = 2;

    public static void whoAmI() {
        System.out.println("B");
    }

    @Override
    public void getInstance() {
        System.out.println(this.hashCode());
    }
}

class CanStaticOverridden {

    public static void main(String... args) {
        A.whoAmI();
        B.whoAmI();

        A a = new A();
        B b = new B();
        
        System.out.println(A.id);
        System.out.println(B.id);
        
        System.out.println(a.id);
        System.out.println(((A)b).id);
        
        a.getInstance();
        b.getInstance();
    }

}
