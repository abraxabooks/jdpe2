/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter15;

public class Radio {
    
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 10;
    public static final int DEFAULT_VOLUME = 5;
    
    private boolean on;
    private int volume;
    
    public Radio() {
        on = false;
        volume = DEFAULT_VOLUME;
    }
    
    public boolean isOn() {
        return on;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void on() {
        on = true;
        System.out.println("Radio now on, volume level " +
                            getVolume());
    }
    
    public void off() {
        on = false;
        System.out.println("Radio now off");
    }
    
    public void volumeUp() {
        if (isOn()) {
            if (getVolume() < MAX_VOLUME) {
                volume++;
                System.out.println("Volume turned up to level " + 
                                    getVolume());
            }
        }
    }
    
    public void volumeDown() {
        if (isOn()) {
            if (getVolume() > MIN_VOLUME) {
                volume--;
                System.out.println("Volume turned down to level " + 
                                    getVolume());
            }
        }
    }

}
