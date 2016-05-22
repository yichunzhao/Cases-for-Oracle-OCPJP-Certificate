/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class UsingStrBuilder {

    StringBuilder sb;
    
    public UsingStrBuilder(String str) {
        sb = new StringBuilder(str);
    }
    
    public static void main(String[] args) {
        
        UsingStrBuilder builder = new UsingStrBuilder("this is string buildier. ");
        builder.sb.append(12.45f);
        
        System.out.println("" + builder.sb);
        builder.sb.append(1);
        builder.sb.append("ddddddddd");
        builder.sb.append(new ArrayList());
        
        System.out.println("" + builder.sb);
        
        
        
    }
    
}
