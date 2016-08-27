/*
 * tree set is auto-ordered according to comparator interface impl. 
 * 
 * 
 */
package CollectionFun.SetFun;

import CollectionFun.Person;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author YNZ
 */
public class SetVsList {

    public static void main(String... args) {
        Set<Person> treeSet = new TreeSet<>();

        Person p1 = new Person("ybnx");
        Person p2 = new Person("dadf");
        Person p3 = new Person("eedY");
        Person p4 = new Person("dfgf");

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);

        for (Person p : treeSet) {
            System.out.println(p);
        }

        System.out.println(treeSet);

        treeSet.add(new Person("vhhh"));
        treeSet.add(new Person("ahhh"));

        System.out.println(treeSet);  //tree set is ordered. 

    }

}
