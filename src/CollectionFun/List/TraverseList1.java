/*
 * Java 8 Main features: 1) Streams 2) Lamada expression. 3)Method references
 * 4)Enhanced interfaces. 
 * 
 */
package CollectionFun.List;

import java.util.*;

/**
 *
 * @author YNZ
 */
class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

}

public class TraverseList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Person p1 = new Person("AA", 15);
        Person p2 = new Person("BB", 23);
        Person p3 = new Person("CC", 33);
        Person p4 = new Person("CC", 45);

        Collection<Person> people = new ArrayList<>();
        people.add(p2);
        people.add(p1);
        people.add(p3);
        people.add(p4);

        System.out.println(people);

        //1 iterator
        for (Iterator it = people.iterator(); it.hasNext();) {
            System.out.println("" + ((Person) it.next()).getAge());
        }
        //2 while iternator
        Iterator it = people.iterator();
        while (it.hasNext()) {
            Person next = (Person) it.next();
            System.out.println("" + next.getName());
        }
        // for loop 
        for (int i = 0; i < people.size(); i++) {
            System.out.println("" + ((ArrayList) people).get(i));
        }
        // for each
        for (Person p : people) {
            System.out.println("" + p);
        }

    }

}
