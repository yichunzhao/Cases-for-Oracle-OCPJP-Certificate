/*
 * how to convert a string into an enum 
 * 
 * 
 */
package Enum;


/**
 *
 * @author YNZ
 */
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class MyClass {

    public static void main(String args[]) {
        
       Boolean yes =  Day.valueOf("Monday".toUpperCase()).equals(Day.MONDAY);
        System.out.println(""+ yes);
        

    }
}
