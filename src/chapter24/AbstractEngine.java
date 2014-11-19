/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter24;

public abstract class AbstractEngine implements Engine {
    
    private int size;
    private boolean turbo;
    
    private Camshaft camshaft;
    private Piston piston;
    private SparkPlug[] sparkPlugs;
    
    
    public AbstractEngine(int size, boolean turbo) {
        this.size = size;
        this.turbo = turbo;
        
        // Create a camshaft, piston and 4 spark plugs...
        camshaft = new Camshaft();
        piston = new Piston();
        sparkPlugs = new SparkPlug[]{new SparkPlug(),
                                     new SparkPlug(),
                                     new SparkPlug(),
                                     new SparkPlug()};
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isTurbo() {
        return turbo;
    }

    public void acceptEngineVisitor(EngineVisitor visitor) {
        // Visit each component first...
        camshaft.acceptEngineVisitor(visitor);
        piston.acceptEngineVisitor(visitor);
        for (SparkPlug eachSparkPlug : sparkPlugs) {
            eachSparkPlug.acceptEngineVisitor(visitor);
        }
        
        // Now visit the receiver...
        visitor.visit(this);
    }

    public String toString() {
        return getClass().getSimpleName() +
               " (" + size + ")";
    }
    
}
