/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

import source.Test;

/**
 *
 * @author YNZ
 */
public class StaticImp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test tst= new Test();
        System.out.println(tst.getC_1());

        Test.getC1(); // private constant cannot, must via a public static method. 
        System.out.println(Test.C3);//public constant could be accessed externally
    }
    
}
