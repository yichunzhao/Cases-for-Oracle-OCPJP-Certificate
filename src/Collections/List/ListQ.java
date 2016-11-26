/*
 * Q interface impl. by LinkedList, underlying implemented by a double linked list. 
 * peek: take head without removing it. 
 * poll: take head and removing it. 
 * List is a container to store elements in a sequence. 
 */
package Collections.List;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author YNZ
 */
class Contract {

    private String customer;
    private String Order;

    public Contract() {
    }

    public Contract(String customer, String Order) {
        this.customer = customer;
        this.Order = Order;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getOrder() {
        return Order;
    }

    public void setOrder(String Order) {
        this.Order = Order;
    }
    
    @Override
    public String toString(){
        return this.Order;
    }

}

public class ListQ {

    public static void main(String[] args) {
        Queue<Contract> q = (Queue) new LinkedList(); //narrowing principle, requiring casting. Q is genric.
        q.add(new Contract("YNZ","Nokia"));
        q.add(new Contract("CHY","Huawei"));
        q.add(new Contract("XYZ","iPhone"));
        q.add(new Contract("YNZ","Nokia"));
        System.out.println("in the Q: "+ q);

        //peek, take the head without removing it.
        System.out.println("head:  " + q.peek());
        q.offer(new Contract("Does", "Sony"));
        System.out.println("head:  " + q.peek());
        
        
        System.out.println("in the Q: "+ q);
        q.add(new Contract("App", "OBH"));
        System.out.println("in the Q: "+ q);
        
        //poll, take head with removing it.
        System.out.println("head: " + q.poll());
        System.out.println("in the Q: "+ q);
        
        

    }
}
