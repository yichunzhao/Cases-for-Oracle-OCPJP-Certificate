/*
 * 
 * 
 * 
 */
package Overloading;

/**
 *
 * @author YNZ
 */
class A {

    int a;
    short b;
    char c = 'q';
    

    A() {
        a = c;
        System.out.println("a=" + a);
    }
}

class B extends A {

}

public class ConstructorOverload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        B b = new B();

    }
}
