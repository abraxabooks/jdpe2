/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter29.business;

import chapter29.db.*;
import java.io.*;

public enum BusinessFacade {
    
    INSTANCE;
    
    public Object[] getEngineTypes() {
        return EngineFactory.Type.values();
    }
    
    public Object[] getAllEngines() {
        return DatabaseFacade.INSTANCE.getAllEngines();
    }
    
    public Object addEngine(int size, Object type) {
        Engine engine = EngineFactory.create
                (size, type == EngineFactory.Type.TURBO);
        DatabaseFacade.INSTANCE.addEngine(engine);
        return engine;
    }
    
    public void saveEngines() throws IOException {
        DatabaseFacade.INSTANCE.saveEngines();
    }
    
    public void restoreEngines() throws IOException {
        DatabaseFacade.INSTANCE.restoreEngines();
    }
    
    public void addEngineListener(EntityListener listener) {
        DatabaseFacade.INSTANCE.addEngineListener(listener);
    }
    
    public void removeEngineListener(EntityListener listener) {
        DatabaseFacade.INSTANCE.removeEngineListener(listener);
    }
    
}
