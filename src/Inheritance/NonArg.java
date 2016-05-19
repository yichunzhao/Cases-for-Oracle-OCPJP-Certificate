/*
 * base.print or xxBase.print called?
 * 
 * 
 */
package Inheritance;

/**
 *
 * @author YNZ
 */


abstract class AbstractBase{
 abstract void getIdea(int i) throws Exception;    
}

class Bbase extends AbstractBase {

    Bbase() {
        print();
    }

    void print() {
        System.out.println("A");
    }

    @Override
    void getIdea(int i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class XXBbase1 extends Bbase {

    int i = Math.round(3.5f);

    public static void main(String[] args) {
        Bbase a = new XXBbase1();
        a.print();
    }

    void print() {
        System.out.println(i);
    }
}
