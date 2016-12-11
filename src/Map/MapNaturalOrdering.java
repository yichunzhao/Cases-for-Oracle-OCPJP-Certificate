/*
 * Comparable interface defines a natrual ordering
 * map not allowing duplicated key
 * map using comparable interface to determine equality, not equalto
 */
package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author YNZ
 */
enum IceCream {
    STRAWBERRY, CHOCOLATE, WALNUT
};

class Flavor implements Comparable<Flavor> {

    private String name;

    public Flavor(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Flavor f) {
        return this.name.compareTo(f.name);
    }

    @Override
    public String toString() {
        return this.name;
    }

}

class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor f1, Flavor f2) {
        return f1.compareTo(f2);
    }

}

public class MapNaturalOrdering {

    public static void main(String... vars) {
        Map<Flavor, String> flavorMap = new TreeMap<>();
        flavorMap.put(new Flavor("Vanilla"), "Selvan");
        flavorMap.put(new Flavor("Chocolate"), "Paul");
        flavorMap.put(new Flavor("Chocolate"), "Paul");
        System.out.println(flavorMap);

        Map<Flavor, String> flavorMap1 = new TreeMap<>(new FlavorComparator());
        flavorMap1.put(new Flavor("Vanilla"), "Selvan");
        flavorMap1.put(new Flavor("Chocolate"), "Paul");
        flavorMap1.put(new Flavor("Chocolate"), "Paul");
        System.out.println(flavorMap1);

        Map<IceCream, String> flavorMap2 = new TreeMap<>();
        flavorMap2.put(IceCream.CHOCOLATE, "Paul");
        flavorMap2.put(IceCream.STRAWBERRY, "Selvan");
        System.out.println(flavorMap2);

    }

}
