/*
 * Overriding is about inheritance. methods inherited can be overrien in the 
 * sub-classes. 
 * 
 */
package virtualMethod;

/**
 *
 * @author YNZ
 */
class A {

    public static void doConstant() {
        System.out.println("in class A do constant");
    }

    public void doSth() {
        System.out.println("in the class A");
    }

}

class B extends A {
    
    public static void doConstant(){
        System.out.println("in class B do constant");
    }

    @Override
    public void doSth() {
        System.out.println("in the class B");
    }

}

public class VitualMethod {

    public static void main(String... args) {
        A a0 = new A();
        A a1 = new B();

        a0.doSth();
        a1.doSth();
        A.doConstant();
        B.doConstant();

    }

}
