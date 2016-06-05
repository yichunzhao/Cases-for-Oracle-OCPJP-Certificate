/*
 * class variable and instance could not be pionted to an object, but automatically
 * assigned a null value. watch out here, it won't cause a compiling error,
 * but a runtime null pointer exception. 
 */
package Ex;

/**
 *
 * @author YNZ
 */
public class ThrowAnotherNullPointerException {

    static String[] oldLaptops;

    public static void main(String[] args) {
        System.out.println(oldLaptops[1]);
        String[] newLaptops = new String[2];
        System.out.println(newLaptops[1].toString());
    }

}
