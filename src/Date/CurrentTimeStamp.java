/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author YNZ
 */
public class CurrentTimeStamp {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("current time: "+ timestamp.toString());
        System.out.println("current time: "+ timestamp);
        
        Date date = new Date(System.currentTimeMillis());
        System.out.println("current date : " + date);
        
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date current = new Date();
        
        System.out.println("raw date" + current);
        System.out.println("formated:  " + df.format(date));
        
        
    }
    
}
