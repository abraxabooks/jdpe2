/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter22;

public abstract class AbstractCar extends AbstractVehicle {
    
    private GearboxStrategy gearboxStrategy;

    public AbstractCar(Engine engine) {
        this(engine, Vehicle.Colour.UNPAINTED);
    }
    
    public AbstractCar(Engine engine, Vehicle.Colour colour) {
        super(engine, colour);
        
        // Starts in standard gearbox mode (more economical)
        gearboxStrategy = new StandardGearboxStrategy();
    }
    
    // Allow the gearbox strategy to be changed...
    public void setGearboxStrategy(GearboxStrategy gearboxStrategy) {
        this.gearboxStrategy = gearboxStrategy;
    }
    
    public GearboxStrategy getGearboxStrategy() {
        return gearboxStrategy;
    }
    
    public void setSpeed(int speed) {
    // Delegate to strategy in effect...
        gearboxStrategy.ensureCorrectGear(getEngine(), speed);
    }
    
}
