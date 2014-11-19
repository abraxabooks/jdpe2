/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter05;

public class Client {
    
    public static void main(String[] args) {
        //VehicleManager manager = new VehicleManager();
        VehicleManagerLazy manager = new VehicleManagerLazy();
        
        Vehicle saloon1 = manager.createSaloon();
        Vehicle saloon2 = manager.createSaloon();
        Vehicle pickup1 = manager.createPickup();
        
        System.out.println(saloon1);
        System.out.println(saloon2);
        System.out.println(pickup1);
    }
    
}
