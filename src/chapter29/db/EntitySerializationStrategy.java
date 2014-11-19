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

public class EntitySerializationStrategy extends AbstractEntityPersistenceStrategy {

    String getFileSuffix() {
        return ".ser";
    }

    void save(EntityTable table) throws IOException {
        File file = new File(getFileName(table) + getFileSuffix());
        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(table);
        oos.close();
    }

    EntityTable restore(EntityTable table) throws IOException {
        File file = new File(getFileName(table) + getFileSuffix());
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        try {
            table = (EntityTable) ois.readObject();
        } catch (ClassNotFoundException ex) {
            throw new IOException(ex);
        }
        ois.close();
        return table;
    }
    
}
