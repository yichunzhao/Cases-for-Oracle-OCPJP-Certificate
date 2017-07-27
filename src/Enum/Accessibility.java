/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author YNZ
 */


public enum Accessibility {
    ONCE_WEEK("once per week"), TWICE_WEEK("twice per week"), FEW_TIME_WEEK("few time per week");
    private String descrip;

    private Accessibility(String descrip) {
        this.descrip = descrip;
    }

    public String getDescrip() {
        return this.descrip;
    }
    
    public static List<String> getAccessibilities(){
        return Arrays.asList(Accessibility.values()).stream().map(x -> x.getDescrip()).collect(Collectors.toList());
    }
}

class UsingAccessiblity {

    public static void main(String[] args) {

        System.out.println(Accessibility.FEW_TIME_WEEK.getDescrip());

        System.out.println(Arrays.asList(Accessibility.values()).stream().map(x -> x.getDescrip()).collect(Collectors.toList()));
        
        System.out.println(Accessibility.getAccessibilities());
        

    }
}
