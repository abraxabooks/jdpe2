/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter24;

public interface EngineVisitor {
    
    public void visit(Camshaft camshaft);
    public void visit(Engine engine);
    public void visit(Piston piston);
    public void visit(SparkPlug sparkPlug);
    
}
