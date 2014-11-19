/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter19;

public class Client {
    
    public static void main(String[] args) {
        approach1();
        approach2();
    }
    
    private static void approach1() {
        System.out.println("APPROACH 1");
        Speedometer1 speedo = new Speedometer1();
        
        speedo.setCurrentSpeed(50);
        speedo.setCurrentSpeed(100);
        System.out.println("Current speed: " + speedo.getCurrentSpeed());
        System.out.println("Previous speed: " + speedo.previousSpeed);
        
        // Save the state of 'speedo'
        SpeedometerMemento1 memento = new SpeedometerMemento1(speedo);
        
        // Change the state of 'speed0'
        speedo.setCurrentSpeed(80);
        System.out.println("After setting to 80...");
        System.out.println("Current speed: " + speedo.getCurrentSpeed());
        System.out.println("Previous speed: " + speedo.previousSpeed);
        
        // Restore the state of 'speedo'
        System.out.println("Now restoring state...");
        memento.restoreState();
        System.out.println("Current speed: " + speedo.getCurrentSpeed());
        System.out.println("Previous speed: " + speedo.previousSpeed);
    }
    
    private static void approach2() {
        try {
            System.out.println("APPROACH 2");
            Speedometer2 speedo = new Speedometer2();

            speedo.setCurrentSpeed(50);
            speedo.setCurrentSpeed(100);
            System.out.println("Current speed: " + speedo.getCurrentSpeed());
            System.out.println("Previous speed: " + speedo.getPreviousSpeed());

            // Save the state of 'speedo'
            SpeedometerMemento2 memento = new SpeedometerMemento2(speedo);

            // Change the state of 'speed0'
            speedo.setCurrentSpeed(80);
            System.out.println("After setting to 80...");
            System.out.println("Current speed: " + speedo.getCurrentSpeed());
            System.out.println("Previous speed: " + speedo.getPreviousSpeed());

            // Restore the state of 'speedo'
            System.out.println("Now restoring state...");
            speedo = memento.restoreState();
            System.out.println("Current speed: " + speedo.getCurrentSpeed());
            System.out.println("Previous speed: " + speedo.getPreviousSpeed());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
