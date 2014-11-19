/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter08;

public interface Engine {
    
    public int getSize();
    public boolean isTurbo();
    
    public void start();
    public void stop();
    public void increasePower();
    public void decreasePower();
    
}
