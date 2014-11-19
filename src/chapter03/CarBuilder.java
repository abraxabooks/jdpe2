/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter03;

import chapter01.*;

public class CarBuilder extends VehicleBuilder {
    
    private AbstractCar carInProgress;
    
    public CarBuilder(AbstractCar car) {
        carInProgress = car;
    }
    
    public void buildBody() {
        // Add body to carInProgress
        System.out.println("Building car body");
    }
    
    public void buildBoot() {
        // Add boot to carInProgress
        System.out.println("Building car boot");
    }
    
    public void buildChassis() {
        // Add chassis to carInProgress
        System.out.println("Building car chassis");
    }
    
    public void buildPassengerArea() {
        // Add passenger area to carInProgress
        System.out.println("Building car passenger area");
    }
    
    public void buildWindows() {
        // Add windows to carInProgress
        System.out.println("Building car windows");
    }

    public Vehicle getVehicle() {
        return carInProgress;
    }
    
}
