/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localization;

import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author YNZ
 */
public class UsingSysLocale {
    
    public static void main(String[] args) {
      Locale local1 = Locale.CHINA;
      Locale local2 = Locale.PRC;
      
        System.out.println("local1: " + local1.toString() + " " + local1.getDisplayCountry());
        System.out.println("local2: " + local2.toString() + " " + local2.getDisplayCountry());
        
        System.out.println("local1: " + local1.getDisplayLanguage());
        System.out.println("local2: " + local2.getDisplayLanguage());
        
        System.out.println("Default: " + Locale.getDefault() + " " + Arrays.toString(Locale.getISOCountries()));
        System.out.println("" + Arrays.toString(Locale.getAvailableLocales()));
        System.out.println("" + Arrays.toString(Locale.getISOLanguages()));

        
    }
    
}
