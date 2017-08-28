/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFun.TraverseCollection;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class MayUseIterator {
    
    public static void main(String[] args) {
        List<BigDecimal> numbers = Arrays.asList(
                BigDecimal.valueOf(1000), BigDecimal.valueOf(20.45),
                BigDecimal.valueOf(50), BigDecimal.valueOf(90908)
        );
        
        System.out.println("" + numbers);
        System.out.println("++++++");
        
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("" + numbers.get(i));
        }
        
        System.out.println("++++++");
        for(BigDecimal n : numbers){
            System.out.println(""+n);
        }
        
        System.out.println("++++++");
        if (!numbers.isEmpty()) {
            System.out.println("" + numbers.iterator().next());
        }
        
        Iterator it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println("" + it.next());
        }
        
        System.out.println("++++++");
        for (Iterator i = numbers.iterator(); i.hasNext();) {
            System.out.println("" + i.next());
        }
        
        System.out.println("++++++");
        numbers.stream().forEach(n -> System.out.println(n));
        
        System.out.println("number is Iterable type? " + String.valueOf(numbers instanceof Iterable));
        
    }
    
}
