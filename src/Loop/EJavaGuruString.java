/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loop;

/**
 *
 * @author YNZ
 */
public class EJavaGuruString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ejg1 = new String("E Java");
        String ejg2 = new String("E Java");
        String ejg3 = "E Java";
        String ejg4 = "E Java";
        do {
            System.out.println(ejg1.equals(ejg2));
        } while (ejg3 == ejg4);
    }

}
