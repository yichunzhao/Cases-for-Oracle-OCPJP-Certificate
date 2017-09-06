/*
 * regular expression (regx) is a lang. having syntax. 
 * 
 * 
 */
package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author YNZ
 */
public class UseRegex {

    public static void main(String[] args) {
        //regular expression, that describes a model. 
        String regx = "[fdn]ine";
        //target 
        String target = "I am fine to dine at nine";
        //compling a regular expression into a pattern
        Pattern pattern = Pattern.compile(regx);
        //matcher that match with a pattern
        Matcher matcher = pattern.matcher(target);
        //find the pattern in a target String
        while (matcher.find()) {
            System.out.println(matcher.group() + " start at " + matcher.start() + ", ends at " + matcher.end());
        }
    }

}
