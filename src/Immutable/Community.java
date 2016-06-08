/*
 * how to make a class immutable. 
 * 1) don't provide "setter" to modify fields
 * 2) make all fields final and private
 * 3) don't make class inherited. 
 * 4) if the instance fields include ref. to mutable objects, don't allow those obj. to be changed.
 * 5) don't provide mutable obj. ref. externally, return a copy.  
 */
package Immutable;

/**
 *
 * @author YNZ
 */

//final class cannot be inheritted
final class Person {

    final private String firstName; //constant field cannot be modified. 
    final private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class Community{
    public static void main(String[] args) {
        Person p = new Person("Yichun", "Zhao");
        p.getFirstName();
        p.getLastName();
        
    }
}