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

public enum DatabaseFacade {
    
    INSTANCE;
    
    private EntityTable engines;
    private AbstractEntityPersistenceStrategy persistenceStrategy;
    
    DatabaseFacade() {
        engines = new EntityTable(EntityKeyGenerator.ENGINE);
        
        // Set which persistence strategy to use
        // (maybe get from configuration settings somewhere)
        persistenceStrategy = new EntitySerializationStrategy();
    }
    
    public Object[] getAllEngines() {
        return engines.getAll().toArray();
    }
    
    public Object getEngine(Integer key) {
        return engines.getByKey(key);
    }
    
    public Integer addEngine(Object engine) {
        return engines.addEntity(engine);
    }
    
    public void addEngineListener(EntityListener listener) {
        engines.addEntityListener(listener);
    }
    
    public void removeEngineListener(EntityListener listener) {
        engines.removeEntityListener(listener);
    }
    
    public void saveEngines() throws IOException {
        persistenceStrategy.save(engines);
    }
    
    public void restoreEngines() throws IOException {
        EntityTable restoredEngines =
                persistenceStrategy.restore(engines);
        engines.restore(restoredEngines);
    }
    
}
