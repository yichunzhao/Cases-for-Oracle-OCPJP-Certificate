/*
 * custom-object is allowed to compare each other as they implementing comparable interface
 * comparable interface is a java built-in interface, which contains single 
 * virtual method, compareTo(Object o). As using comparable interface instead of
 * comparator interface, then you don't need specify an external external 
 * comparator class as using Collections and Arrays service sorting method or 
 * shuffle method etc. 
 */
package Comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author YNZ
 */
class Apple implements Comparable<Apple> {

    private float size;

    public Apple(float size) {
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    @Override
    public int compareTo(Apple o) {
        return Float.compare(size, o.getSize());
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }

}

public class UsingComparableInterface {

    public static void main(String[] var) {
        Apple a1 = new Apple(0.5f);
        Apple a2 = new Apple(0.6f);
        Apple a3 = new Apple(0.44f);
        List<Apple> listApple = new ArrayList<>();
        listApple.add(a3);
        listApple.add(a2);
        listApple.add(a1);

        //before sorting.
        System.out.println(listApple);
        Collections.sort(listApple);
        //after sorting.
        System.out.println(listApple);

        //shuffle
        Collections.shuffle(listApple);
        System.out.println(listApple);
        
        //or using service class Arrays
        Apple[] a = new Apple[listApple.size()];
        Arrays.sort(listApple.toArray(a));
        System.out.println(Arrays.toString(a));
    }

}
