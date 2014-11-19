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

public class VanBuilder extends VehicleBuilder {
    
    private AbstractVan vanInProgress;
    
    public VanBuilder(AbstractVan van) {
        vanInProgress = van;
    }
    
    public void buildBody() {
        // Add body to vanInProgress
        System.out.println("Building van body");
    }
    
    public void buildChassis() {
        // Add chassis to vanInProgress
        System.out.println("Building van chassis");
    }
    
    public void buildReinforcedStorageArea() {
        // Add storage area to vanInProgress
        System.out.println("Building van passenger area");
    }
    
    public void buildWindows() {
        // Add windows to vanInProgress
        System.out.println("Building van windows");
    }

    public Vehicle getVehicle() {
        return vanInProgress;
    }
    
}
