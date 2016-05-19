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
class ShadowOrNot {

    int x = 5;

    int getX() {
        return x;
    }

    public static void main(String args[]) throws Exception {
        ShadowOrNot tc = new ShadowOrNot();
        tc.looper();
        System.out.println(tc.x);
    }

    public void looper() {
        int x = 0; //local var. scope of method shadowing
        while ((x = getX()) != 0) {
            for (int m = 10; m >= 0; m--) {
                x = m;
            }
        }
    }

}
