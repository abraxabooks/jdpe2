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

public class CarFactory extends VehicleFactory {

    protected Vehicle selectVehicle(DrivingStyle style) {
        if (style == DrivingStyle.ECONOMICAL) {
            return new Saloon(new StandardEngine(1300));
        
        } else if (style == DrivingStyle.MIDRANGE) {
            return new Coupe(new StandardEngine(1600));
        
        } else {
            return new Sport(new TurboEngine(2000));
        }
    }
    
}
