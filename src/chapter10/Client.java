/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter10;

public class Client {
    
    public static void main(String[] args) {
        // Create a blue saloon car...
        Vehicle myCar = new Saloon(new StandardEngine(1300));
        myCar.paint(Vehicle.Colour.BLUE);
        System.out.println(myCar);
        
        // Add air-conditioning to the car...
        myCar = new AirConditionedVehicle(myCar);
        System.out.println(myCar);
        
        // Now add alloy wheels...
        myCar = new AlloyWheeledVehicle(myCar);
        System.out.println(myCar);
        
        // Now add leather seats...
        myCar = new LeatherSeatedVehicle(myCar);
        System.out.println(myCar);
        
        // Now add metallic paint...
        myCar = new MetallicPaintedVehicle(myCar);
        System.out.println(myCar);
        
        // Now add satellite-navigation...
        myCar = new SatNavVehicle(myCar);
        System.out.println(myCar);
    }
    
}
