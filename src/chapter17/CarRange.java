/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter17;

import chapter01.*;
import java.util.*;

public class CarRange implements Iterable<Vehicle> {
    
    //
    private List<Vehicle> cars;
    
    public CarRange() {
        cars = new ArrayList<Vehicle>();
        
        // Define the range of car models available
        cars.add(new Saloon(new StandardEngine(1300)));
        cars.add(new Saloon(new StandardEngine(1600)));
        cars.add(new Coupe(new StandardEngine(2000)));
        cars.add(new Sport(new TurboEngine(2500)));
    }
    
    public List<Vehicle> getRange() {
        return cars;
    }

    public Iterator<Vehicle> iterator() {
        return cars.listIterator();
    }
    
}
