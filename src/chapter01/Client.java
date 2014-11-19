/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter01;

public class Client {

    public static void main(String[] args) {
        // Sample engines...
        Engine engine1 = new StandardEngine(1300);
        Engine engine2 = new TurboEngine(2000);
        
        System.out.println(engine1);
        System.out.println(engine2);
        
        // Sample vehicles...
        Vehicle car = new Saloon(engine1, Vehicle.Colour.RED);
        Vehicle van = new BoxVan(engine2, Vehicle.Colour.WHITE);
        
        System.out.println(car);
        System.out.println(van);
    }
    
}
