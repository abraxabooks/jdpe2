/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter19;

import java.io.*;

public class SpeedometerMemento2 {
    
    public SpeedometerMemento2(Speedometer2 speedometer)
                                            throws IOException {
        // Serialize...
        File speedometerFile = new File("speedometer.ser");
        ObjectOutputStream oos =
                new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(speedometerFile)));
        oos.writeObject(speedometer);
        oos.close();
    }
    
    public Speedometer2 restoreState() throws IOException, ClassNotFoundException {
        // Deserialize...
        File speedometerFile = new File("speedometer.ser");
        ObjectInputStream ois =
                new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(speedometerFile)));
        Speedometer2 speedo = (Speedometer2) ois.readObject();
        ois.close();
        return speedo;
    }
    
}
