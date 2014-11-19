/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter21;

public class Client {
    
    public static void main(String[] args) {
        ClockSetup clockSetup = new ClockSetup();
        
        // Setup starts in 'year' state
        clockSetup.rotateKnobRight();
        clockSetup.pushKnob(); // year should be 1 on from current
        
        // Setup should now be in 'month' state
        clockSetup.rotateKnobRight();
        clockSetup.rotateKnobRight();
        clockSetup.pushKnob(); // month should be 2 on from current
        
        // Setup should now be in 'day' state
        clockSetup.rotateKnobRight();
        clockSetup.rotateKnobRight();
        clockSetup.rotateKnobRight();
        clockSetup.pushKnob(); // day should be 3 on from current
        
        // Setup should now be in 'hour' state
        clockSetup.rotateKnobLeft();
        clockSetup.rotateKnobLeft();
        clockSetup.pushKnob(); // hour should be 2 less than current
        
        // Setup should now be in 'minute' state
        clockSetup.rotateKnobRight();
        clockSetup.pushKnob(); // minute should be 1 on than current
        
        // Setup should now be in 'finished'
        clockSetup.pushKnob(); // to display selected date
    }
    
}
