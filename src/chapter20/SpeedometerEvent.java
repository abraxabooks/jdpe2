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

public class SpeedometerEvent extends EventObject {
    
    private int speed;
    
    public SpeedometerEvent(Object source, int speed) {
        super(source);
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }
    
}
