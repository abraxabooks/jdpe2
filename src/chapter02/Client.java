/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter02;

public class Client {
    
    public static void main(String[] args) {
        String whatToMake = "car"; // or "van"
        
        AbstractVehicleFactory factory = null;
        
        // Create the correct 'factory'...
        if (whatToMake.equals("car")) {
            factory = new CarFactory();
        } else {
            factory = new VanFactory();
        }
        
        // Create the vehicle's component parts...
        // These will either be all car parts or all van parts.
        Body vehicleBody = factory.createBody();
        Chassis vehicleChassis = factory.createChassis();
        Windows vehicleWindows = factory.createWindows();
        
        // Show what we've created...
        System.out.println(vehicleBody.getBodyParts());
        System.out.println(vehicleChassis.getChassisParts());
        System.out.println(vehicleWindows.getWindowParts());
    }
    
}
