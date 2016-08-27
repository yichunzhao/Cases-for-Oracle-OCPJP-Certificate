/*
 * Queue is implemented by the LinkedList; 
 * retrieve head: element(), peek(), and poll(); 
 * add to the tail of queue: add()
 */
package CollectionFun.List;

import java.util.LinkedList;
import java.util.Queue;
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
        for (int i = 1; i < 4; i++) {
            if (a > 'Z') {
                break;
            }
            String name = String.valueOf(a).concat(String.valueOf(a));
            linkedPersons.add(new Person(name, r.nextInt(100)));
            a++;
        }
        
        Queue<Person> queue = linkedPersons;
        System.out.println("Initial Q = " + queue);
        
        Person head = queue.element();
        System.out.println("after element = " + head);
        System.out.println("Q = " + queue);
        
        Person peek = queue.peek();
        System.out.println("after peek = " + peek);
        System.out.println("Q = " + queue);
        
        Person poll = queue.poll();
        System.out.println("after poll = " + poll);
        
        System.out.println("Q = " + queue);
        
        queue.add(new Person("Ynz",55));
        System.out.println("Q added " + queue);
        System.out.println("element = "+ queue.element());
        

    }

}
