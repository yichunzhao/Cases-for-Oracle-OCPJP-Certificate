/*
 * Variables cannot be overridden, but hidden(shadowing) in the lower scope.
 * Class variables can be hidden in the sub-class. 
 * Instance methods can be overriden in the sub-classes. Which method reffered depends on which object pointed to in runtime. 
 * Class methods cannot be overriden, but hidden(shadowing)
 */

package Hidden;

/**
 *
 * @author YNZ
 */
class A {

    public int size = 10;
    public int age = 12;

    public void doSth() {
        System.out.println("A");
    }
}

class B extends A {

    public int size = 20;
    private int age = 13;

    @Override
    public void doSth() {
        System.out.println("B");
    }
}

class C extends B {

    @Override
    public void doSth() {
        System.out.println("C");
    }

}

public class Hidden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        C c = new C();
        //size in B hidding size in A
        System.out.println(c.size);
        //private age in B hides the public age in A
        //System.out.println(c.age);  //not valid
        System.out.println(((A) c).age);
        c.doSth();
        
        System.out.println("--------------");        
        B c1 = new C();
        c1.doSth();
        
        System.out.println("+++++++++++++++");        
        B b = new B();
        
        System.out.println(((A)b).age);
        b.doSth();
        
        System.out.println("+++++++++++++++");                
        A a = new C();
        a.doSth();
        System.out.println(a.age);
        
        System.out.println("+++++++++++++++");        
        A a1 = new A();
        a1.doSth();
        System.out.println(a1.age);
        

    }

}
