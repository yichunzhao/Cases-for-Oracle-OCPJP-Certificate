/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author YNZ
 */
class CoreJava {

    public CoreJava(Integer a) {
        System.out.println("It is an Integer");
    }

    public CoreJava(long b) {
        System.out.println("It is a long");
    }

    public CoreJava(int... x) {
        System.out.println("It is a int...");
    }
    
    public CoreJava(float x) {
        System.out.println("It is a int...");
    }
 
    public static void main(String[] args) {
        new CoreJava(8);
        new CoreJava((float)8.8);

    }

}
