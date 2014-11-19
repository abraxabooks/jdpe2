/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter08;

import chapter01.*;

public abstract class AbstractDriverControls {
    
    private Engine engine;
    
    public AbstractDriverControls(Engine engine) {
        this.engine = engine;
    }
    
    public void ignitionOn() {
        engine.start();
    }
    
    public void ignitionOff() {
        engine.stop();
    }
    
    public void accelerate() {
        engine.increasePower();
    }
    
    public void brake() {
        engine.decreasePower();
    }
    
}
