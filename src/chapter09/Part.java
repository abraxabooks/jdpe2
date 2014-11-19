/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter09;

public class Part extends Item {

    public Part(String description, int cost) {
        super(description, cost);
    }
    
    // Empty  implementation for unit parts...
    public void addItem(Item item) {}
    public void removeItem(Item item) {}
    public Item[] getItems() {return new Item[0];}
    
}
