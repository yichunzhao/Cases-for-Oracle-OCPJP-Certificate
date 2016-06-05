/*
 * for ... each loop also can change the element.
 * 
 * 
 */
package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author YNZ
 */
public class ModifyElemForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Number> nums = new ArrayList();
        nums.add(new Integer("1"));
        nums.add(new Integer("2"));
        nums.add(new Integer("3"));
        nums.add(new Integer("10"));
        nums.add(new Integer("11"));

        for (Number e : nums) {
            if (e.equals(3)) {
                int index = nums.indexOf(e);
                nums.set(index, new Integer("555"));
            }
        }
        
        System.out.println(nums);
        
        ListIterator it = nums.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
