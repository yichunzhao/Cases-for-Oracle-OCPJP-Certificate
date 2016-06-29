/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
class A {

    void polish() throws MyException {
        throw new MyException();
    }

    void doWell() throws MyException1 {
        throw new MyException1();
    }
}

class CaptureEx {

    public static void main(String[] args) throws MyException1 {
        A a = new A();
        try {
            a.doWell();
        } finally {

        }
        
        
        
    }

}
