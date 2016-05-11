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
public class Ternary {

    static String name = "ynz"; //instance field
    private int age;

    static String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 14;
        int b = 12;
        float age = 12.8f;
        //var. = bookean condition ? value1: value2 
        //var should have the same type with values
        String r = (a < b) ? "yes" : getName();
        System.out.println("ternary = " + r);
        
        Ternary t = new Ternary();
        System.out.println(age);
        
              

    

    }

}
