/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fina;

/**
 *
 * @author YNZ
 */
public final class KeyFinal {

    public static final int A = 10;
    public static final int B;
    public final int x;

    static {
        B = 30;
    }

    public KeyFinal() {
        this.x = 20;
    }

    public final void doSome() {
        System.out.println("" + this.x);
    }

    public static void main(String[] args) {
        KeyFinal kf = new KeyFinal();
        System.out.println("" + A);
        kf.doSome();

    }

}
