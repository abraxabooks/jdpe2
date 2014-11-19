/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter24;

public class EngineInventory implements EngineVisitor {
    
    private int camshaftCount;
    private int pistonCount;
    private int sparkPlugCount;
    
    public EngineInventory() {
        camshaftCount = 0;
        pistonCount = 0;
        sparkPlugCount = 0;
    }

    public void visit(Camshaft camshaft) {
        camshaftCount++;
    }

    public void visit(Engine engine) {
        System.out.println("The engine has: " +
                            camshaftCount + " camshaft(s), " +
                            pistonCount + " piston(s), and " +
                            sparkPlugCount + " spark plug(s)");
    }

    public void visit(Piston piston) {
        pistonCount++;
    }

    public void visit(SparkPlug sparkPlug) {
        sparkPlugCount++;
    }
    
}
