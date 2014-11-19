/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter01;

public interface Vehicle {

    public enum Colour {UNPAINTED, BLUE, BLACK, GREEN,
                        RED, SILVER, WHITE, YELLOW};
    
    public Engine getEngine();
    public Vehicle.Colour getColour();
    public void paint(Vehicle.Colour colour);
    
}
