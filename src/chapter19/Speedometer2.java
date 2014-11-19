/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter19;

import java.io.*;

public class Speedometer2 implements Serializable {
    
    private int currentSpeed;
    private int previousSpeed;
    
    public Speedometer2() {
        currentSpeed = 0;
        previousSpeed = 0;
    }
    
    public void setCurrentSpeed(int speed) {
        previousSpeed = this.currentSpeed;
        this.currentSpeed = speed;
    }
    
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    
    // Only defined to help testing...
    public int getPreviousSpeed() {
        return previousSpeed;
    }
    
}
