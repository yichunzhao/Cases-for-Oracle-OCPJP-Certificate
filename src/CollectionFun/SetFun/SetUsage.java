/*
 * HashSet uses hashCode() to determine which bucket to put the element.
 * It is also the way to determine uniqueness. 
 * 
 */
package CollectionFun.SetFun;

import CollectionFun.Person;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author YNZ
 */
public class SetUsage {

    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        persons.add(new Person("Tom", 13));
        persons.add(new Person("Mike", 15));
        persons.add(new Person("Alex", 21));
        persons.add(new Person("Tom", 15));
        persons.add(new Person("Tom", 13));
        System.out.println(persons);
        
        System.out.println(""+new Person("Tom", 13).hashCode());
        System.out.println(""+new Person("Tom", 15).hashCode());
        System.out.println(new Person("Tom", 13).compareTo(new Person("Tom", 15)));
    }
}
