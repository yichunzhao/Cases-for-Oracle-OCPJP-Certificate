/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import Inheritance.Animal;
import Inheritance.Cat;
import CollectionFun.Apple;

/**
 *
 * @author YNZ
 */
public class UseCage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        Apple apple = new Apple(1.2f);

        Cage cage = new Cage();
        Cage cage1 = new Cage(animal);

        Cat cat = new Cat();
        cage.setT(cat);

        System.out.println("cage1 " + cage1.getT());
    }
}
