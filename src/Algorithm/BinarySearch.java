/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class BinarySearch {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 43, 4, 4554, 565, 43434,999);
        System.out.println("" + list);

        int index = Collections.binarySearch(list, 565);
        System.out.println("index = " + index);
    }

}
