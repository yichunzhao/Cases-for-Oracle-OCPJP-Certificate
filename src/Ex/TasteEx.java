/*
 * 
 * 
 * 
 */
package Ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author YNZ
 */
public class TasteEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            try {
                FileReader fr = new FileReader(new File("test.txt"));
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
                return;
            } finally {
                System.out.println("inner final");
                //return;
            }
            System.out.println("try outer");
            int[] ary = new int[2];
            ary[0] = 10;
            ary[5] = 20;

        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Index out of bounds");

        } finally {
            System.out.println("outer final");
        }

        System.out.println("next task");
    }

}
