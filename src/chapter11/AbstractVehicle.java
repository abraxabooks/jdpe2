/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter11;

/**
 *
 * @author Tony
 */
public abstract class AbstractVehicle implements Vehicle {
    
    private Engine engine;
    private Vehicle.Colour colour;
    
    public AbstractVehicle(Engine engine) {
        this(engine, Vehicle.Colour.UNPAINTED);
    }
    
    public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
        this.engine = engine;
        this.colour = colour;
    }
    
    public Engine getEngine() {
        return engine;
    }
    
    public Vehicle.Colour getColour() {
        return colour;
    }
    
    public void paint(Vehicle.Colour colour) {
        this.colour = colour;
    }
    
    public void cleanInterior() {
        System.out.println("Cleaning interior");
    }
    
    public void cleanExteriorBody() {
        System.out.println("Cleaning exterior");
    }
    
    public void polishWindows() {
        System.out.println("polishing windows");
    }
    
    public void takeForTestDrive() {
        System.out.println("taking for test drive");
    }
    
    public String toString() {
        return getClass().getSimpleName() +
                " (" + engine + ", " + colour + ")";
    }
    
}
