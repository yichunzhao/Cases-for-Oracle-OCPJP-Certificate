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
public class ExOPP {

    /**
     * @param args the command line arguments
     * @throws Ex.MyException
     *
     */
    public static void main(String[] args) throws MyException{
        A a = new A();
        try {
            a.polish();
        } catch (MyException ex) {
            Logger.getLogger(ExOPP.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println("t");
        }

    }

}
