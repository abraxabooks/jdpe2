/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter22;

public class StandardGearboxStrategy implements GearboxStrategy {

    public void ensureCorrectGear(Engine engine, int speed) {
        int engineSize = engine.getSize();
        boolean turbo = engine.isTurbo();
        
        // Some complicated code to determine correct gear
        // setting based on engineSize, turbo & speed, etc.
        // ... omitted ...
        
        System.out.println("Working out correct gear at " +
                speed + "mph for a STANDARD gearbox");
    }
    
}
