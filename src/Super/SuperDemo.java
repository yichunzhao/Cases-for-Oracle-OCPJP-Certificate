/*
 * 
 * No matter what, in the sub-class super() will be automatically added 
 * at top of the constructor. 
 */
package Super;

/**
 *
 * @author YNZ
 */
class A {

    public A() {
        System.out.println("A class.");
    }
}

class B extends A{
    public B(){
        
    }
    
    public B(String name){
        System.out.println("my name: " + name);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B b = new B();
        
        B b1 = new B("Dell");
    }

}
