/*
 * Checked runtime exception can handled, but not compulsory. 
 * You may remove all try catch blocks without compiling errors. 
 * 
 */
package Ex;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class NumFormatEx {

    /**
     * @param args the command line arguments
     */
    public static boolean main(String[] args) {
        boolean on = false;
            try {
                int a = Integer.parseInt("1233.4");
            } catch (Throwable t) {
                on = true;
                return on;

            } finally {
                return on = false;
            }
            
            
        }
    }

    
    


    

    

