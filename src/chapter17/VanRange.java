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
import java.util.Arrays;
import java.util.Iterator;

public class VanRange implements Iterable<Vehicle> {
    
    //
    private Vehicle[] vans;
    
    public VanRange() {
        vans = new Vehicle[3];
        
        // Define the range of van models available
        vans[0] = new BoxVan(new StandardEngine(1600));
        vans[1] = new BoxVan(new StandardEngine(2000));
        vans[2] = new Pickup(new TurboEngine(2200));
    }
    
    public Vehicle[] getRange() {
        return vans;
    }

    public Iterator<Vehicle> iterator() {
        return Arrays.asList(vans).listIterator();
    }
    
}
