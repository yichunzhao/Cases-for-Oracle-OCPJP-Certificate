/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.Time;
import java.util.GregorianCalendar;

/**
 *
 * @author YNZ
 */
public interface timeable {
    GregorianCalendar getCurrentDate();
    Time getCurrentTime();

}
