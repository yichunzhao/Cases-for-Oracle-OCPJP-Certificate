/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author YNZ
 */
class CCC {

    CCC() {
        System.out.println("default access constructor");
    }

}

class DDD {

    protected DDD() {

    }
}

class EEE {

    private EEE() {
        System.out.println("private constructor");

    }

    final public static void main(String... vars) {
        new EEE();

    }

}

public class AccessConstruct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new CCC();
        
        float f = (float) 10e1;
        int i = 10;
        long l = 10;
        double d = 10;
        
        
        System.out.println("emptiness".length()+ " "+ "emptiness".substring(10));
        Float.valueOf("10.22").floatValue();

    }

}
