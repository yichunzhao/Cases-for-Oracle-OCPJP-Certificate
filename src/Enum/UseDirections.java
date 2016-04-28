/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author YNZ
 */
public class UseDirections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (Direction d : Direction.values()) {
            System.out.println(d + " " + Direction.valueOf(d.name()));

        }

    }

}
