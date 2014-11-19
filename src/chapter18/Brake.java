/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter18;

public class Brake {
    
    private EngineManagementSystem mediator;
    private boolean enabled;
    private boolean applied;
    
    // Constructor accepts mediator as an argument
    public Brake(EngineManagementSystem mediator) {
        this.mediator = mediator;
        enabled = false;
        applied = false;
        mediator.registerBrake(this);
    }
    
    public void enable() {
        enabled = true;
        mediator.brakeEnabled();
        System.out.println("Brakes enabled");
    }
    
    public void disable() {
        enabled = false;
        mediator.brakeDisabled();
        System.out.println("Brakes disabled");
    }
    
    public boolean isEnabled() {
        return enabled;
    }
    
    public void apply() {
        if (isEnabled()) {
            applied = true;
            mediator.brakePressed();
            System.out.println("Now braking");
        }
    }
    
    private void release() {
        if (isEnabled()) {
            applied = false;
        }
    }
    
}
