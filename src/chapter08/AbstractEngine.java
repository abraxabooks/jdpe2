/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter08;

/**
 *
 * @author Tony
 */
public abstract class AbstractEngine implements Engine {
    
    private int size;
    private boolean turbo;
    private boolean running;
    private int power;
    
    public AbstractEngine(int size, boolean turbo) {
        this.size = size;
        this.turbo = turbo;
        running = false;
        power = 0;
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isTurbo() {
        return turbo;
    }
    
    public void start() {
        running = true;
        System.out.println("Engine started");
    }
    
    public void stop() {
        running = false;
        power = 0;
        System.out.println("Engine stopped");
    }
    
    public void increasePower() {
        if (running && (power < 10)) {
            power++;
            System.out.println("Engine power increased to " + power);
        }
    }
    
    public void decreasePower() {
        if (running && (power > 0)) {
            power--;
            System.out.println("Engine power decreased to " + power);
        }
    }
    
    public String toString() {
        return getClass().getSimpleName() +
                " (" + size + ")";
    }
    
}
