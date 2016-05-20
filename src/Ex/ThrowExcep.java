/*
 * exception happends in catch block won't be caught.
 * using nested try block to catch it. 
 * or throws to caller. 
 */
package Ex;

import java.io.IOException;

/**
 *
 * @author YNZ
 */
class PortConnector {

    public PortConnector(int port) throws Exception {
        if (Math.random() > 0.5) {
            throw new IOException();
        }
        throw new MyException();
    }
}

class ThrowExcep {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) throws Exception {
        try {
            try {
                PortConnector pc = new PortConnector(10);
            } catch (Exception re) {
                re.printStackTrace();
                throw new ArithmeticException();
            } finally {
                System.out.println("finally");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
