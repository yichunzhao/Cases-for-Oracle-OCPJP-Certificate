/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun.List;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author YNZ
 */
public class UseLinkedList {

    public static void main(String[] args) {

        LinkedList<Person> linkedPersons = new LinkedList<>();
        Random r = new Random();
        char a = 'A';
        for (int i = 1; i < 30; i++) {
            if (a >= 'Z') {
                break;
            }
            String name = String.valueOf(a).concat(String.valueOf(a));
            linkedPersons.add(new Person(name, r.nextInt(100)));
            a++;
        }
        
        linkedPersons.add(new Person("YNZ", 20));
        //System.out.println(linkedPersons);
        
        linkedPersons.addFirst(new Person("YNZ", 30));
        //System.out.println(linkedPersons);
        
        Person px = linkedPersons.element();
        System.out.println(px);

    }

}
