/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter13;

import chapter12.*;

public class EngineProxy implements Engine {
    
    private Engine engine;
    
    public EngineProxy(int size, boolean turbo) {
        if (turbo) {
            engine = new TurboEngine(size);
        } else {
            engine = new StandardEngine(size);
        }
    }
    
    public int getSize() {
        return engine.getSize();
    }
    
    public boolean isTurbo() {
        return engine.isTurbo();
    }
    
    // This method is time-consuming...
    public void diagnose(final DiagnosticTool tool) {
        // Run the method as a separate thread
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("(Running tool as thread)");
                engine.diagnose(tool);
            }
        });
        t.start();
        System.out.println("EngineProxy diagnose() method finished");
    }
    
}
