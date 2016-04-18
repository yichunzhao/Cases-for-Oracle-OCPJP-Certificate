/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condition;

/**
 *
 * @author YNZ
 */
public class ShortCircuit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // true || false then there is no need to evaluate the second condition
        // false && true then there is no need to evlaute the scond condition
        //no exception
        String str = null;
        if (true || str.equals("")) {
            System.out.println("I am here");
        }

        //here throw nonpointer exception
        if (str.equals("") || true) {
            System.out.println("I am here");
        }

        if (str.equals("") && true) {
            System.out.println("I am here");
        }

        //here throw nonpointer exception
        if (true && str.equals("")) {
            System.out.println("I am here");
        }

        int val1 = 1;
        int val2 = 2;
        if ((val1 == 1) && (val2 == 1)) {
            System.out.println("val1==1&&val2==2");
        }

        if ((val1 == 0) || (val2 == 2)) {
            System.out.println("val1==1||val2==2");
        }


    }
}
