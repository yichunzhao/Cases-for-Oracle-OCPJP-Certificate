/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author YNZ
 */
public class ObjectRuntimeType {
    public static void main(String[] args) {
        Object o = new Integer("12");
        System.out.println("Is object? " + String.valueOf(o instanceof Object));
        System.out.println("Is object? " + String.valueOf(o instanceof Integer));
    }
    
}
