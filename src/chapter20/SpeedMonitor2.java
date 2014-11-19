/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter20;

public class SpeedMonitor2 implements SpeedometerListener {
    
    public static final int SPEED_TO_ALERT = 70;
    
    public void speedChanged(SpeedometerEvent event) {
        if (event.getSpeed() > SPEED_TO_ALERT) {
            System.out.println("** ALERT ** Driving too fast! (" +
                    event.getSpeed() + ")");
        
        } else {
            System.out.println("... nice and steady ... (" +
                    event.getSpeed() + ")");
        }
    }
    
}
