/*
 * In inheritance context, super() will be automatically added by compiler in 
 * each sub-class constructor, even it is not explicitly declared. 
 * 
 */
package Inheritance;

class Father {

    public Father() {
        System.out.println("in father!");
    }

    public Father(String wife) {
        System.out.println("in father wife!");
    }

}

class Kid extends Father {

    public Kid() {
        System.out.println("in kid!");
    }

    public Kid(String mother) {
        System.out.println("in kid mother!");
    }

}

/**
 *
 * @author YNZ
 */
public class TestSuper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Kid kid = new Kid();
        System.out.println("----");
        Kid kid1 = new Kid("mother");
    }

}
