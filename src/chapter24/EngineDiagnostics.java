/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter24;

public class EngineDiagnostics implements EngineVisitor {

    public void visit(Camshaft camshaft) {
        System.out.println("Diagnosing the camshaft");
    }

    public void visit(Engine engine) {
        System.out.println("Diagnosing the engine");
    }

    public void visit(Piston piston) {
        System.out.println("Diagnosing the piston");
    }

    public void visit(SparkPlug sparkPlug) {
        System.out.println("Diagnosing a single spark plug");
    }
    
}
