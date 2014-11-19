/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter20;

public class Client {
    
    public static void main(String[] args) {
        approach1();
        approach2();
    }
    
    private static void approach1() {
        // Create a monitor...
        SpeedMonitor1 monitor = new SpeedMonitor1();
        
        // Create a speedometer and register the monitor to it...
        Speedometer1 speedo = new Speedometer1();
        speedo.addObserver(monitor);
        
        // Add automatic gearbox as an observer
        speedo.addObserver(new AutomaticGearbox());
        
        // Drive at different speeds...
        speedo.setCurrentSpeed(50);
        speedo.setCurrentSpeed(70);
        speedo.setCurrentSpeed(40);
        speedo.setCurrentSpeed(100);
        speedo.setCurrentSpeed(69);
    }
    
    private static void approach2() {
        // Create a monitor...
        SpeedMonitor2 monitor = new SpeedMonitor2();
        
        // Create a speedometer and register the monitor to it...
        Speedometer2 speedo = new Speedometer2();
        speedo.addSpeedometerListener(monitor);
        
        // Drive at different speeds...
        speedo.setCurrentSpeed(50);
        speedo.setCurrentSpeed(70);
        speedo.setCurrentSpeed(40);
        speedo.setCurrentSpeed(100);
        speedo.setCurrentSpeed(69);
    }
    
}
