/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author YNZ
 */
public class Immutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //I assume it is safe in multi-thread context. how you can change its content?
        Student student = new Student("Yichun", "Zhao");
        student = new Student("Wenqi", "Huang");
        //result shows Wenqi Huang; so it is not immutable. 
        System.out.println("this student = " + student.getFirstName() + " " + student.getLastName());

        String str = "who am I?";
        String str1 = str;
        if (str == str1) {
            System.out.println("we are same" + str);
        }
        str = "I am not alone.";
        System.out.println(str);
        System.out.println(str1);
        
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());
        
    }
}
