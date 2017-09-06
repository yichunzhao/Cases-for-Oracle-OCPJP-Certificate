/*
 * 
 * Simple class type:  matching exaclty one from the set [agfd]
 * 
 */
package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author YNZ
 */
public class UsingSimpleRegx {

    public static void main(String[] args) {
        String regx = "[agfd]";
        String target = "I have a dog.";

        Pattern p = Pattern.compile(regx);
        Matcher m = p.matcher(target);
        while (m.find()) {
            System.out.println(m.group() + "start " + m.start() + " end " + m.end());
        }

    }

}
