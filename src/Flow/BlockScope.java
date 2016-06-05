/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flow;

/**
 *
 * @author YNZ
 */
public class BlockScope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean b = false; //method scope
        if (b) {
            int i = 0; //block scope
        } else {
            int i = 1; //block scope
        }
    }

}
