/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author YNZ
 */
public class Circle implements Rollable {

    public Circle() {
        System.out.println("this circle");
    }

    @Override
    public void roll(float degree) {
        System.out.println("roll this object " + degree + " degree. ");
    }
    
    public static void main(String[] args) {
        Rollable r = new Circle();
        r.roll(30f);
    }

}
