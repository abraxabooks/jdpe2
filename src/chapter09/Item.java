/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter09;

public abstract class Item {
    
    private String description;
    private int cost;
    
    public Item(String description, int cost) {
        this.description = description;
        this.cost = cost;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getCost() {
        return cost;
    }
    
    public abstract void addItem(Item item);
    public abstract void removeItem(Item item);
    public abstract Item[] getItems();
    
    public String toString() {
        return description + " (cost " + getCost() + ")";
    }
    
}
