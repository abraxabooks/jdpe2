/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter25;

public class Client {
    
    public static void main(String[] args) {
        WarningLight[] lights = new WarningLight[3];
        lights[0] = new OilLevelLight();
        lights[1] = new BrakeFluidLight();
        lights[2] = new NullObjectLight(); // empty slot
        
        // No need to test for null...
        for (WarningLight currentLight : lights) {
            currentLight.turnOn();
            currentLight.turnOff();
            System.out.println(currentLight.isOn());
        }
    }
    
}
