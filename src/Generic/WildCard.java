/*
 * The purpose of java Generics is for putting the same type objects into the same
 * container. 
 * So Generics is a topic relating to the object and collections. 
 * The idea of impl. is declaring formal object type, and replacing them in the compiling. 
 */
package Generic;

/**
 *
 * @author YNZ
 */
class Person {

    private String name;

    public Person() {
        System.out.println("I am a person");
    }

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
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}

class Employee extends Person {

    private Long id;

    public Employee() {
    }

    public Employee(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}

class Manager extends Person {

    private Long id;

    public Manager() {

    }

}

class Box<T extends Person> {

    private T t;

    public Box() {
    }

    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}

public class WildCard {

    public WildCard() {

    }

    public static void main(String[] args) {
        Box box = new Box(new Person());

        Box box1 = new Box(new Employee(1000L));
        Person p1 = box1.getT();
        System.out.println("p1 is employee: " + String.valueOf(p1 instanceof Employee));

        Box box2 = new Box(new Manager());
        Person s1 = box2.getT();
        System.out.println("s1 is Manager: " + String.valueOf(s1 instanceof Manager));

    }

}
