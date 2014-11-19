/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter20;

import java.util.*;

public class AutomaticGearbox implements Observer {

    public void update(Observable obs, Object obj) {
        Speedometer1 speedo = (Speedometer1) obs;
        
        if (speedo.getCurrentSpeed() <= 10) {
            System.out.println("Now in first gear");
        
        } else if (speedo.getCurrentSpeed() <= 20) {
            System.out.println("Now in second gear");
        
        } else if (speedo.getCurrentSpeed() <= 30) {
            System.out.println("Now in third gear");
        
        } else {
            System.out.println("Now in fourth gear");
        }
    }
    
}
