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

public class Client {
    
    //
    public static void main(String[] args) {
        System.out.println("=== Our Cars ===");
        CarRange carRange2 = new CarRange();
        printIterator(carRange2.iterator());

        System.out.println("=== Our Vans ===");
        VanRange vanRange2 = new VanRange();
        printIterator(vanRange2.iterator());
        
        
        // USING FOR-EACH
        System.out.println("=== Our Cars ===");
        CarRange carRange3 = new CarRange();
        for (Vehicle currentVehicle : carRange3.getRange()) {
            System.out.println(currentVehicle);
        }

        System.out.println("=== Our Vans ===");
        VanRange vanRange3 = new VanRange();
        for (Vehicle currentVehicle : vanRange3.getRange()) {
            System.out.println(currentVehicle);
        }
    }
    
    private static void printIterator(Iterator iter) {
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
    
}
