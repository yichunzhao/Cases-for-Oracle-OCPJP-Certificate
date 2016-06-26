/*
 * null pointer exception is unchecked exception. 
 * 
 * check it, before using it. 
 */
package Ex;

import java.util.ArrayList;

/**
 *
 * @author YNZ
 */
public class NullPointerExceptionTest {

    static private ArrayList<String> al;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (al != null) {
            al.add("ss");
        }
    }

    NullPointerExceptionTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
