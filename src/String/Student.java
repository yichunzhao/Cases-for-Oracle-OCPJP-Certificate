/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author YNZ
 */
public final class Student {
    private final String firstName;
    private final String LastName;

    public Student(String firstName, String LastName) {
        this.firstName = firstName;
        this.LastName = LastName;
   }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }
    
}
