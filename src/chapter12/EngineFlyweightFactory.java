/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter12;

import java.util.*;

public class EngineFlyweightFactory {
    
    private Map<Integer, Engine> standardEnginePool;
    private Map<Integer, Engine> turboEnginePool;
    
    public EngineFlyweightFactory() {
        standardEnginePool = new HashMap<Integer, Engine>();
        turboEnginePool = new HashMap<Integer, Engine>();
    }
    
    public Engine getStandardEngine(int size) {
        Engine e = standardEnginePool.get(size);
        if (e == null) {
            e = new StandardEngine(size);
            standardEnginePool.put(size, e);
        }
        return e;
    }
    
    public Engine getTurboEngine(int size) {
        Engine e = turboEnginePool.get(size);
        if (e == null) {
            e = new TurboEngine(size);
            turboEnginePool.put(size, e);
        }
        return e;
    }
    
}
