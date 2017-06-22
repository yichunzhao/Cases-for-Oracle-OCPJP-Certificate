/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author YNZ
 */
class Worker implements Runnable {

    private Random r = new Random();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}

class Person implements Comparable<Person> {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareToIgnoreCase(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Car {

    private String brand;

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return this.brand;
    }
}

class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getBrand().compareToIgnoreCase(o2.getBrand());
    }
}

class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class LambadaFunctionDemo {

    public static void main(String[] args) {
        new Thread(new Worker()).start();

        List<Person> list = new ArrayList<>();
        list.add(new Person("Yichun"));
        list.add(new Person("Mike"));
        System.out.println("" + list.toString());
        Collections.sort(list);
        System.out.println("" + list.toString());

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford"));
        cars.add(new Car("Benz"));
        cars.add(new Car("Audi"));
        Collections.sort(cars, new CarComparator());
        System.out.println("" + cars.toString());

        List<User> users = new ArrayList<>();
        users.add(new User("Yichun"));
        users.add(new User("Bose"));
        users.add(new User("Mia"));
        
        //functional interface
        //lambda expression
//        Comparator<User> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
//        Collections.sort(users, comparator);
        System.out.println(""+users.toString());
        
        Collections.sort(users,(o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(""+users.toString());

    }

}
