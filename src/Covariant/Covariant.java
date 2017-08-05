/*
 * Since Java 5, overriding may follow the covariant principle. 
 * 
 * 
 */
package Covariant;

/**
 *
 * @author YNZ
 */

class A {
    public Number getStatus(){
        return new Double(3434.56D);
    }
}

class B extends A{
    @Override
    public Integer getStatus(){
        return new Integer(20);
    }
}

public class Covariant {
    public static void main(String[] args) {
        System.out.println(""+new A().getStatus());
        System.out.println(""+new B().getStatus());
    }
   
}
