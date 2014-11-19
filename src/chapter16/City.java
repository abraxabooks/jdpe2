/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter16;

public class City {
    
    private String name;
    private double latitude, longitude;
    
    public City(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public String getName() {
        return name;
    }
    
    public double getLatitude() {
        return latitude;
    }
    
    public double getLongitude() {
        return longitude;
    }
    
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (! (otherObject instanceof City)) return false;
        City otherCity = (City) otherObject;
        return getName().equals(otherCity.getName());
    }
    
    public int hashCode() {
        return getName().hashCode();
    }
    
    public String toString() {
        return getName();
    }
    
}
