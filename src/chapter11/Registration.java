/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter11;

public class Registration {
    
    private Vehicle vehicle;
    
    public Registration(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void allocateLicensePlate() {
        // code omitted...
        System.out.println("License plate allocated");
    }
    
    public void allocateVehicleNumber() {
        // code omitted...
        System.out.println("Vehicle number allocated");
    }
    
}
