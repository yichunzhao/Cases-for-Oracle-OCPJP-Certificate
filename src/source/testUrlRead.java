/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package source;

/**
 *
 * @author YNZ
 */
public class testUrlRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UrlConnection uc = new UrlConnection("http://followthewhiterabbit.trustpilot.com/sd/43ecc69998979e816deb20da6da169f3.html");
        uc.readUrlConnection();
     
    }
    
}
