/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author YNZ
 */
public enum Accessibility {
    ONCE_WEEK("once per week"), TWICE_WEEK("twice per week"), FEW_TIME_WEEK("few time per week");
    private String text;

    private Accessibility(String text) {
        this.text = text;
    }

    public String text() {
        return this.text;
    }

    public static List<String> getAccessibilities() {
        return Arrays.asList(Accessibility.values()).stream().map(x -> x.text()).collect(Collectors.toList());
    }

    public static Accessibility getAccessibility(String text) {
        return Arrays.asList(Accessibility.values()).stream().filter(x -> x.text().equals(text)).collect(Collectors.toList()).get(0);
    }
}

class UsingAccessiblity {

    public static void main(String[] args) {

        System.out.println(Accessibility.FEW_TIME_WEEK.text());

        System.out.println(Arrays.asList(Accessibility.values()).stream().map(x -> x.text()).collect(Collectors.toList()));

        System.out.println(Accessibility.getAccessibilities());

        System.out.println(Accessibility.getAccessibility("twice per week").name());

    }
}
