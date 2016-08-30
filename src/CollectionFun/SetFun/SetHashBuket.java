/*
 * Why hashset is called hash? it uses hash code to determine which bucket 
 * the object should be allocated. 
 * Hashset used equals() to determine the uniqueness. 
 * Hashset internally is implemented by a HashMap, key-value pairs. Object hashcode 
 * is stored as the key of the value(object), for a fast retreiving. 
 */
package CollectionFun.SetFun;

import CollectionFun.Person;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author YNZ
 */
public class SetHashBuket {

    public static void main(String[] args) {
        //HashSet use equals() to determine uniqueness.  
        Set<String> mySet = new HashSet<>(5, 0.8f);
        mySet.add("aa");
        mySet.add("aa");
        mySet.add(new String("aa"));
        System.out.println(mySet);

        //
        Set<Person> persons = new HashSet<>(5, 0.8f);
        persons.add(new Person("ynz"));
        persons.add(new Person("ynz"));
        persons.add(new Person("OCK"));
        persons.add(new Person("aaa"));
        System.out.println(persons);

        System.out.println("hashcode OCK " + "OCK".hashCode());
        System.out.println("hashcode ynz" + "ynz".hashCode());
        System.out.println("hashcode aaa" + "aaa".hashCode());

        //let's see how hashcode determins object's bucket
        Set<String> buckets = new HashSet<>(5, 0.8f);
        buckets.add("OCK");
        buckets.add("ynz");
        buckets.add("aaa");
        System.out.println(buckets);

        //lineked hashset is ordered
        Set<String> linkBuckets = new LinkedHashSet<>(5, 0.8f);
        linkBuckets.add("OCK");
        linkBuckets.add("ynz");
        linkBuckets.add("aaa");
        System.out.println(linkBuckets);

        //treeSet is ordered 
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("OCK");
        treeSet.add("ynz");
        treeSet.add("aaa");
        System.out.println(treeSet);
        
        
        
    }
}
