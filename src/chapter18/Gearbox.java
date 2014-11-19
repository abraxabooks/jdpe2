/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter18;

public class Gearbox {

    public enum Gear {NEUTRAL,
                      FIRST, SECOND, THIRD, FOURTH, FIFTH,
                      REVERSE};
    
    private EngineManagementSystem mediator;
    private boolean enabled;
    private Gear currentGear;
    
    // Constructor accepts mediator as an argument
    public Gearbox(EngineManagementSystem mediator) {
        this.mediator = mediator;
        enabled = false;
        currentGear = Gear.NEUTRAL;
        mediator.registerGearbox(this);
    }
    
    public void enable() {
        enabled = true;
        mediator.gearboxEnabled();
        System.out.println("Gearbox enabled");
    }
    
    public void disable() {
        enabled = false;
        mediator.gearboxDisabled();
        System.out.println("Gearbox disabled");
    }
    
    public boolean isEnabled() {
        return enabled;
    }
    
    public void setGear(Gear g) {
        if ((isEnabled()) && (getGear() != g)) {
            currentGear = g;
            mediator.gearChanged();
            System.out.println("Now in " + getGear() + " gear");
        }
    }
    
    private Gear getGear() {
        return currentGear;
    }
    
}
