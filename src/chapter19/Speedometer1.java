/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter19;

public class Speedometer1 {
    
    // Normal private visibility but has accessor method...
    private int currentSpeed;
    
    // package-private visibility and no accessor method...
    int previousSpeed;
    
    public Speedometer1() {
        currentSpeed = 0;
        previousSpeed = 0;
    }
    
    public void setCurrentSpeed(int speed) {
        previousSpeed = currentSpeed;
        currentSpeed = speed;
    }
    
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    
}
