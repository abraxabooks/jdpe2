/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter05;

public class VehicleManager {
    
    private Vehicle saloon, coupe, sport, boxVan, pickup;
    
    public VehicleManager() {
        // For simplicity all vehicles use same engine type...
        saloon = new Saloon(new StandardEngine(1300));
        coupe = new Coupe(new StandardEngine(1300));
        sport = new Sport(new StandardEngine(1300));
        boxVan = new BoxVan(new StandardEngine(1300));
        pickup = new Pickup(new StandardEngine(1300));
    }
    
    public Vehicle createSaloon() {
        return (Vehicle) saloon.clone();
    }
    
    public Vehicle createCoupe() {
        return (Vehicle) coupe.clone();
    }
    
    public Vehicle createSport() {
        return (Vehicle) sport.clone();
    }
    
    public Vehicle createBoxVan() {
        return (Vehicle) boxVan.clone();
    }
    
    public Vehicle createPickup() {
        return (Vehicle) pickup.clone();
    }
    
}
