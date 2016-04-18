/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConCurrency;

/**
 *
 * @author YNZ
 */
public class Th3 extends Thread {

    private final int times;
    private StringBuffer sb;

    public Th3(int times, StringBuffer sb) {
        this.times = times;
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            sb.append(" ").append(this.getClass().toString());
        }
    }

}
