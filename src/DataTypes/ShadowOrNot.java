/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

/**
 *
 * @author YNZ
 */
class TestClass {

    int x = 5;

    int getX() {
        return x;
    }

    public static void main(String args[]) throws Exception {
        TestClass tc = new TestClass();
        tc.looper();
        System.out.println(tc.x);
    }

    public void looper() {
        int x = 0;
        while ((x = getX()) != 0) {
            for (int m = 10; m >= 0; m--) {
                x = m;
            }
        }
    }

}
