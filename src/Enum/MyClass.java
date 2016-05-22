/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author YNZ
 */
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class MyClass {

    public static void main(String args[]) {

        Set<Day> mySet = new HashSet();

        mySet.add(Day.SATURDAY);
        mySet.add(Day.WEDNESDAY);
        mySet.add(Day.FRIDAY);
        mySet.add(Day.WEDNESDAY);
     
        for (Day d : mySet) {
            System.out.println(d);
        }
    }
}
