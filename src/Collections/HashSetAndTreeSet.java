/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author YNZ
 */
public class HashSetAndTreeSet {
    private Set<Integer> setHash = new HashSet<>();
    private Set<Integer> setTree = new TreeSet<>();

    {
        for (int i = 0; i < 10; i++) {
            setHash.add(i);
            setTree.add(i);
        }
    }

    public HashSetAndTreeSet() {
    }

    public Set<Integer> getSetHash() {
        return setHash;
    }

    public Set<Integer> getSetTree() {
        return setTree;
    }
    
    

    public static void main(String[] args) {
        
        HashSetAndTreeSet hashSetAndTreeSet = new HashSetAndTreeSet();
        Set set1 = hashSetAndTreeSet.getSetHash();
        Set set2 = hashSetAndTreeSet.getSetTree();
        
        System.out.println("set1 "+ set1);
        System.out.println("set2 "+ set2);
        
                
        

    }

}
