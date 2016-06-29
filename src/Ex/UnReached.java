/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

/**
 *
 * @author YNZ
 */

class UnReached {

    public static void main(String[] args) {
        try {
            amethod();
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("out");
    }

    public static void amethod() throws Exception {
    }
}
