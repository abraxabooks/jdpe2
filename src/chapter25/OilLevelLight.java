/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter25;

public class OilLevelLight implements WarningLight {
    
    private boolean on;

    public void turnOn() {
        on = true;
        System.out.println("Oil level light ON");
    }

    public void turnOff() {
        on = false;
        System.out.println("Oil level light OFF");
    }
    
    public boolean isOn() {
        return on;
    }
    
}
