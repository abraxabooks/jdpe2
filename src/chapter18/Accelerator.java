/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter18;

public class Accelerator {
    
    private EngineManagementSystem mediator;
    private boolean enabled;
    private int speed;
    
    // Constructor accepts mediator as an argument
    public Accelerator(EngineManagementSystem mediator) {
        this.mediator = mediator;
        enabled = false;
        speed = 0;
        mediator.registerAccelerator(this);
    }
    
    public void enable() {
        enabled = true;
        mediator.acceleratorEnabled();
        System.out.println("Accelerator enabled");
    }
    
    public void disable() {
        enabled = false;
        mediator.acceleratorDisabled();
        System.out.println("Accelerator disabled");
    }
    
    public boolean isEnabled() {
        return enabled;
    }
    
    public void accelerateToSpeed(int speed) {
        if (isEnabled()) {
            this.speed = speed;
            System.out.println("Speed now " + getSpeed());
        }
    }
    
    public int getSpeed() {
        return speed;
    }
    
}
