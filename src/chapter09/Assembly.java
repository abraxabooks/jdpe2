/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter09;

import java.util.*;

public class Assembly extends Item {

    private List<Item> items;
    
    public Assembly(String description) {
        super(description, 0);
        items = new ArrayList<Item>();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }
    
    public Item[] getItems() {
        return items.toArray(new Item[items.size()]);
    }
    
    // Also have to override getCost() to add cost of items in list
    public int getCost() {
        int total = 0;
        for (Item item : items) {
            total += item.getCost();
        }
        return total;
    }
    
}
