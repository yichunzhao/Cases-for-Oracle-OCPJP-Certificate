/*
 * Protected memebers can be accessed from the external package by its sub-class
 * 
 */
package Modifier;

import Overloading.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YNZ
 */
class Manager extends Employee {

    private String title;

    public Manager() {
    }

    public Manager(String title, String name, int age) {
        super(name, age);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

public class AccessProtected {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Manager("director", "Tom", 40));
        list.add(new Manager("director", "Alice", 45));
        
        System.out.println(list);
        
        for(Employee e:list){
            System.out.println(e.getName()+" "+e.getAge());
        }

    }

}
