/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author YNZ
 */
public class UsePredefinedClasses {

    public static void main(String[] args) {

        String regex = "\\d";
        String target = "A5C7%";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(target);
        while (m.find()) {
            System.out.println(m.group() + " start " + m.start() + " end " + m.end());
        }
    }
}
