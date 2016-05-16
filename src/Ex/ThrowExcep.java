/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

import java.io.IOException;

/**
 *
 * @author YNZ
 */
class PortConnector {

    public PortConnector(int port) throws Exception {
        if (Math.random() > 0.5) {
            throw new IOException();
        }
        throw new RuntimeException();
    }
}

class ThrowExcep {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try {
            PortConnector pc = new PortConnector(10);
        } catch (Exception re) {
            re.printStackTrace();
        }
    }
}

