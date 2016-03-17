/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.net.URL;
import java.security.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author YNZ
 */
public class Str2Md5 {
    private final String str;
    
    private Str2Md5(String answer) {
        this.str = answer;
    }
    
    public byte[] convert() throws UnsupportedEncodingException, NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] b=str.getBytes();
        md.update(b);
        byte[] digested = md.digest(b);              
        
        return digested;
    }
    
    public static void main(String args[]){
        try {
            Str2Md5 convertor = new Str2Md5("answer");
            byte[] digested=convertor.convert();
            StringBuilder sb = new StringBuilder();
            for(byte b: digested){
                 sb.append(String.format("%02x",b));
            }
            
            System.out.println(sb.toString()+" its length = "+ sb.length());
            
                        
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
            Logger.getLogger(Str2Md5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
