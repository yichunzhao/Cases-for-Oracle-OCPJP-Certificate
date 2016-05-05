/*
 * Convert String date into java Date.
 */
package String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class ConvertStringToDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String shop = "Netto Emdrupvej";
        System.out.println(shop.contains("netto"));
        
        //coverting string date to Date  
        String dateInString ="28.04.2016";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
        try {
            Date date = dateFormat.parse(dateInString);
            System.out.println(date);
        } catch (ParseException ex) {
            Logger.getLogger(ConvertStringToDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

}
