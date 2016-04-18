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
public class MyRunnable implements Runnable {

    private final int times;
    private StringBuffer sb;

    public MyRunnable(int times, StringBuffer sb) {
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
