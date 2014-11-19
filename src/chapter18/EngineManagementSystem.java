/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter18;

public class EngineManagementSystem {
    
    private Ignition ignition;
    private Gearbox gearbox;
    private Accelerator accelerator;
    private Brake brake;
    
    private int currentSpeed;
    
    public EngineManagementSystem() {
        currentSpeed = 0;
    }
    
    
    // Methods that enable registration with this mediator...
    
    public void registerIgnition(Ignition ignition) {
        this.ignition = ignition;
    }
    
    public void registerGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }
    
    public void registerAccelerator(Accelerator accelerator) {
        this.accelerator = accelerator;
    }
    
    public void registerBrake(Brake brake) {
        this.brake = brake;
    }
    
    
    // Methods that handle object interactions...
    
    public void ignitionTurnedOn() {
        gearbox.enable();
        accelerator.enable();
        brake.enable();
    }
    
    public void ignitionTurnedOff() {
        gearbox.disable();
        accelerator.disable();
        brake.disable();
    }
    
    public void gearboxEnabled() {
        System.out.println("EMS now controlling the gearbox");
    }
    
    public void gearboxDisabled() {
        System.out.println("EMS no longer controlling the gearbox");
    }
    
    public void gearChanged() {
        System.out.println("EMS disengaging revs while gear changing");
    }
    
    public void acceleratorEnabled() {
        System.out.println("EMS now controlling the accelerator");
    }
    
    public void acceleratorDisabled() {
        System.out.println("EMS no longer controlling the accelerator");
    }
    
    public void acceleratorPressed() {
        brake.disable();
        while (currentSpeed < accelerator.getSpeed()) {
            currentSpeed++;
            System.out.println("Speed currentlt " + currentSpeed);
            
            // Set gear according to speed
            if (currentSpeed <= 10) {
                gearbox.setGear(Gearbox.Gear.FIRST);
            
            } else if (currentSpeed <= 20) {
                gearbox.setGear(Gearbox.Gear.SECOND);
            
            } else if (currentSpeed <= 30) {
                gearbox.setGear(Gearbox.Gear.THIRD);
            
            } else if (currentSpeed <= 50) {
                gearbox.setGear(Gearbox.Gear.FOURTH);
                
            } else {
                gearbox.setGear(Gearbox.Gear.FIFTH);
            }
        }
        brake.enable();
    }
    
    public void brakeEnabled() {
        System.out.println("EMS now controlling the brake");
    }
    
    public void brakeDisabled() {
        System.out.println("EMS no longer controlling the brake");
    }
    
    public void brakePressed() {
        accelerator.disable();
        currentSpeed = 0;
    }
    
    public void brakeReleased() {
        gearbox.setGear(Gearbox.Gear.FIRST);
        accelerator.enable();
    }
    
}
