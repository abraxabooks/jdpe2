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

public class EntityCSVStrategy extends AbstractEntityPersistenceStrategy {

    String getFileSuffix() {
        return ".csv";
    }

    void save(EntityTable table) throws IOException {
        // code to save table data in CSV format (omitted)
    }

    EntityTable restore(EntityTable table) throws IOException {
        // code to restore table data from CSV format (omitted)
        return table;
    }
    
}
