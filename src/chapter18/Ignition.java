/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter18;

public class Ignition {
    
    private EngineManagementSystem mediator;
    private boolean on;
    
    // Constructor accepts mediator as an argument
    public Ignition(EngineManagementSystem mediator) {
        this.mediator = mediator;
        on = false;
        
        // Register back with the mediator;
        mediator.registerIgnition(this);
    }
    
    public void start() {
        on = true;
        mediator.ignitionTurnedOn();
        System.out.println("Ignition turned on");
    }
    
    public void stop() {
        on = false;
        mediator.ignitionTurnedOff();
        System.out.println("Ignition turned off");
    }
    
    public boolean isOn() {
        return on;
    }
    
}
