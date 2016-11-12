/*
 * custome objects can be compared, as implemeting compartor interface
 * 
 * 
 */
package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author YNZ
 */
class Person {

    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return this.name+ " " + this.age;
    }
}

class SortPersonByName implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
    
}

public class SortInstances {
    
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Mike", 23));
        list.add(new Person("Tom", 32));
        list.add(new Person("Karry",18));
        list.add(new Person("Mia",32));
        list.add(new Person("Jerry",16));
        System.out.println("before: "+ list);
        
        Collections.sort(list, new SortPersonByName() );
        System.out.println("before: "+ list);
        
        System.out.println("------- in java 8 -------");
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("Mike", 23));
        list1.add(new Person("Tom", 32));
        list1.add(new Person("Karry",18));
        list1.add(new Person("Mia",32));
        list1.add(new Person("Jerry",16));
        System.out.println("before: "+ list1);
        
        
        
    }

}
