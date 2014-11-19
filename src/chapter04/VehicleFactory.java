/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter04;

import chapter01.*;

public abstract class VehicleFactory {
    
    public enum Category {CAR, VAN}
    public enum DrivingStyle {ECONOMICAL, MIDRANGE, POWERFUL};
    
    public static Vehicle make(Category category,
                               DrivingStyle style,
                               Vehicle.Colour colour) {
        VehicleFactory factory = null;
        
        if (category == Category.CAR) {
            factory = new CarFactory();
        } else {
            factory = new VanFactory();
        }
        
        return factory.build(style, colour);
    }
    
    public Vehicle build(DrivingStyle style, Vehicle.Colour colour) {
        Vehicle v = selectVehicle(style);
        v.paint(colour);
        return v;
    }
    
    // This is the "factory method"
    protected abstract Vehicle selectVehicle(DrivingStyle style);
    
}
