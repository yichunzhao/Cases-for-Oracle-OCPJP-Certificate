/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */
public class UrlConnection {

    private URL url = null;
    private HttpURLConnection con = null;
    private String targetUrl;

    public UrlConnection(String tu) {
        this.targetUrl = tu;
    }

    private HttpURLConnection getConnection() {
        try {
            url = new URL(targetUrl);
            con = (HttpURLConnection) url.openConnection();
        } catch (IOException ex) {
            Logger.getLogger(UrlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public void readUrlConnection() {
        try {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(this.getConnection().getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(UrlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
