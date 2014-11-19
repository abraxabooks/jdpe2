/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter05;

public class VehicleManagerLazy {
    
    private Vehicle saloon, coupe, sport, boxVan, pickup;
    
    public VehicleManagerLazy() {
    }
    
    public Vehicle createSaloon() {
        if (saloon == null) {
            saloon = new Saloon(new StandardEngine(1300));
            return saloon;
        } else {
            return (Vehicle)saloon.clone();
        }
    }
    
    public Vehicle createCoupe() {
        if (coupe == null) {
            coupe = new Coupe(new StandardEngine(1300));
            return coupe;
        } else {
            return (Vehicle) coupe.clone();
        }
    }
    
    public Vehicle createSport() {
        if (sport == null) {
            sport = new Sport(new StandardEngine(1300));
            return sport;
        } else {
            return (Vehicle) sport.clone();
        }
    }
    
    public Vehicle createBoxVan() {
        if (boxVan == null) {
            boxVan = new BoxVan(new StandardEngine(1300));
            return boxVan;
        } else {
            return (Vehicle) boxVan.clone();
        }
    }
    
    public Vehicle createPickup() {
        if (pickup == null) {
            pickup = new Pickup(new StandardEngine(1300));
            return pickup;
        } else {
            return (Vehicle) pickup.clone();
        }
    }
    
}
