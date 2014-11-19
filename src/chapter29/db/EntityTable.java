/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter29.db;

import java.io.*;
import java.util.*;

public class EntityTable implements Serializable {
    
    private EntityKeyGenerator keyGenerator;
    private Map<Integer, Object> entities;
    private Collection<EntityListener> listeners;
    
    EntityTable(EntityKeyGenerator keyGenerator) {
        this.keyGenerator = keyGenerator;
        entities = new HashMap<Integer, Object>();
        listeners = new ArrayList<EntityListener>();
    }
    
    Object getByKey(Integer key) {
        return entities.get(key);
    }
    
    Collection<Object> getAll() {
        return entities.values();
    }
    
    Integer addEntity(Object value) {
        Integer key = keyGenerator.getNextKey();
        entities.put(key, value);
        fireEntityAdded(key, value);
        return key;
    }
    
    void restore(EntityTable restoredTable) {
        entities.clear();
        entities.putAll(restoredTable.entities);
        fireEntityRestored();
    }
    
    void addEntityListener(EntityListener listener) {
        listeners.add(listener);
    }
    
    void removeEntityListener(EntityListener listener) {
        listeners.remove(listener);
    }
    
    void fireEntityAdded(Integer key, Object value) {
        EntityEvent event = new EntityEvent(key, value);
        for (EntityListener listener : listeners) {
            listener.entityAdded(event);
        }
    }
    
    void fireEntityRestored() {
        EntityEvent event = new EntityEvent();
        for (EntityListener listener : listeners) {
            listener.entityRestored(event);
        }
    }
    
}
