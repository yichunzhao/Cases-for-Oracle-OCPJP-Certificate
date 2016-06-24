/*
 * CastException happens in runtime, not compiling time; so even having no compiling 
 *  errors 
 * 
 */
package Ex;

/**
 *
 * @author YNZ
 */

interface Printable {
}

public class CastException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printable printable = null; 
        BlackInk blackInk = new BlackInk();
        printable = (Printable)blackInk;
        //printable = blackInk;
    }

}
