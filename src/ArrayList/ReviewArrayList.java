/*
 * create arraylist, add element, access element, modify element, delete element
 * 
 * 
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

/**
 *
 * @author YNZ
 */
public class ReviewArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();

        Number n1 = 9;
        n1 = 12.98;
        System.out.println(n1 instanceof Double);

        //create
        ArrayList<Number> al = new ArrayList<>(20);
        ArrayList<Integer> al1 = new ArrayList<>();

        System.out.println("al1 size " + al1.size());

        for (int i = 0; i < 10; i++) {
            al1.add(r.nextInt(100));
        }

        //add
        al.add(new Integer("23"));
        al.add(new Float("45.7"));

        System.out.println(al);
        al.add(0, new Double("788.99"));
        System.out.println(al);

        //modify by set index new value
        al.set(1, new Float("2324.98"));
        System.out.println(al);

        //accessing element, but cannot refer it to a new reference. 
        //this doesn't work, I guess this is due to java pass by value. 
        for (Number n : al) {
            if (n instanceof Float) {
                n = r.nextInt(100);

            }
        }
        System.out.println(al);

        for (ListIterator it = al.listIterator(); it.hasNext();) {
            //System.out.println(it.next());
            it.next();
            it.set(new Random().nextInt(100));
        }

        //add all method. 
        al.addAll(al1);
        System.out.println(al);
        System.out.println("al1 size " + al.size());

        al.removeAll(al1);
        System.out.println(al);
        System.out.println("al1 size " + al.size());

        al.add(12);
        al.add(12);
        System.out.println(al);
        System.out.println("al1 size " + al.size());

        al.remove(new Integer(12));
        System.out.println(al);
        System.out.println("al1 size " + al.size());

    }

}
