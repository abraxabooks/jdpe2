/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter06;

public class Client {
    
    public static void main(String[] args) {
        System.out.println("Using traditional singleton");
        SerialNumberGeneratorTraditional generator =
                SerialNumberGeneratorTraditional.getInstance();
        System.out.println("next serial: " + generator.getNextSerial());
        System.out.println("next serial: " + generator.getNextSerial());
        System.out.println("next serial: " + generator.getNextSerial());
        
        System.out.println("Using enum singleton");
        System.out.println("next vehicle: " +
                SerialNumberGenerator.VEHICLE.getNextSerial());
        System.out.println("next vehicle: " +
                SerialNumberGenerator.VEHICLE.getNextSerial());
        System.out.println("next engine: " +
                SerialNumberGenerator.ENGINE.getNextSerial());
        System.out.println("next vehicle: " +
                SerialNumberGenerator.VEHICLE.getNextSerial());
        System.out.println("next engine: " +
                SerialNumberGenerator.ENGINE.getNextSerial());
    }
    
}
