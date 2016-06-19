/*
 * modify an element of array list; 1) set(index, newValue). 
 * 2) modify by accessing element
 * 
 */
package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author YNZ
 */
class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        if (obj instanceof Person) {
            b = ((Person) obj).getName().equals(getName());
        }
        return b;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }
}

public class ModifyArrayListEle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("A"));
        list.add(new Person("B"));
        list.add(new Person("C"));
        list.add(new Person("D"));
        list.add(new Person("D"));

        System.out.println(list.toString());

        //modify index 2, to be another person
        list.set(2, new Person("L"));
        System.out.println(list.toString());

        //modify it back
        for (Person p : list) {
            if (p.getName().equals("L")) {
                p.setName("C");
            }
        }

        System.out.println(list.toString());

        for (Person p : list) {
            if (p.equals(new Person("C"))) {
                p.setName("F");
            }
        }

        System.out.println(list.toString());

    }

}
