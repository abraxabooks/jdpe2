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

public abstract class AbstractEntityPersistenceStrategy {
    
    String getFileName(EntityTable table) {
        return table.getClass().getSimpleName();
    }
    
    abstract String getFileSuffix();
    abstract void save(EntityTable table) throws IOException;
    abstract EntityTable restore(EntityTable table) throws IOException;
    
}
