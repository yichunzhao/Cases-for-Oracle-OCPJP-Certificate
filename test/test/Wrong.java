/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author YNZ
 */
public class Wrong {

    int i;

    public Wrong(int i) {
        this.i = i;
    }

    public String toString() {
        if (i == 0) {
            return null;
        } else {
            return "" + i;
        }
    }

    public static void main(String[] args) {
        Wrong t1 = new Wrong(0);
        Wrong t2 = new Wrong(2);
        System.out.println(t2);
        System.out.println("" + t1);
        
        System.out.println("ddd"+1.233f);
    }

}
