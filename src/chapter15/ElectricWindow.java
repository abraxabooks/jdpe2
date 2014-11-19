/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter15;

public class ElectricWindow {
    
    private boolean open;
    
    public ElectricWindow() {
        open = false;
        System.out.println("Window is closed");
    }
    
    public boolean isOpen() {
        return open;
    }
    
    public boolean isClosed() {
        return (! open);
    }
    
    public void openWindow() {
        if (isClosed()) {
            open = true;
            System.out.println("Window is now open");
        }
    }
    
    public void closeWindow() {
        if (isOpen()) {
            open = false;
            System.out.println("Window is now closed");
        }
    }
    
}
