/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter08;

public class Client {
    
    public static void main(String[] args) {
        Engine engine = new StandardEngine(1300);
        StandardControls controls1 = new StandardControls(engine);
        controls1.ignitionOn();
        controls1.accelerate();
        controls1.brake();
        controls1.ignitionOff();
        
        // Now use sport controls
        SportControls controls2 = new SportControls(engine);
        controls2.ignitionOn();
        controls2.accelerate();
        controls2.accelerateHard();
        controls2.brake();
        controls2.ignitionOff();
    }
    
}
