/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

/**
 *
 * @author YNZ
 */
public class Ask {

    public static final float PI = 3.14_15_926f;
    private static final int INT = 20; 

    int i;   //32 bit signed integer
    short s; //16 bit signed integer
    long l; // 64 bit signed  integer

    float f; // 32 bit signed 
    double d; // 64 bit signed 

    public char c; // 16 bit unicode
    byte by; // 8 bit 

    protected String str;

    boolean b; // This data type represents one bit of information, but its "size" isn't something that's precisely defined.
    private boolean bb;

    public Ask() {
        i = 20_16;
        s = 1;
        l = 1;
        f = 3.3f;
        d = 1e13d;
        c = 'c';
        str = "string!";
        b = true;
        bb= false;
    }

    public boolean isBb() {
        return bb;
    }

    public void setBb(boolean bb) {
        this.bb = bb;
    }
    
    public boolean getBb(){
        return this.bb;
    }     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ask ask = new Ask();

        System.out.println(ask.i + " max/min of integer " + Integer.MAX_VALUE + "  " + Integer.MIN_VALUE + " Size=  " + Integer.SIZE);
        System.out.println(ask.s + " max/min of integer " + Short.MAX_VALUE + "  " + Short.MIN_VALUE + " Size=  " + Short.SIZE);
        System.out.println(ask.l + " max/min of integer " + Long.MAX_VALUE + "  " + Long.MIN_VALUE + " Size=  " + Long.SIZE);

        System.out.println(ask.d + " max/min of integer " + Double.MAX_VALUE + "  " + Double.MIN_VALUE + " Size=  " + Double.SIZE);
        System.out.println(ask.f + " max/min of integer " + Float.MAX_VALUE + "  " + Float.MIN_VALUE + " Size=  " + Float.SIZE);

        System.out.println("ask.str.isEmpty()=" + ask.str.isEmpty());
        System.out.println("ask.b =" + ask.b);
        
        //true || false
        if (ask.str.isEmpty() || ask.b ) {
            System.out.println("short circuite evaluation.");
        }
        //true |false
        if (ask.b | ask.str.isEmpty()) {
            System.out.println("bit or operation, both evaluated");
        }
        
        
        char c = 'a';//16
        short s = (short)c;//16
        int i =c;
        long l = c;
        byte b = (byte)c;
        
        c = (char)b;
        
        //int x=y=z=10;

    }

}
