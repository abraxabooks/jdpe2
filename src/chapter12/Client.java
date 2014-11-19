/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter12;

public class Client {
    
    public static void main(String[] args) {
        // Create the flyweightfactory...
        EngineFlyweightFactory factory = new EngineFlyweightFactory();
        
        // Create the diagnostic tool
        DiagnosticTool tool = new EngineDiagnosticTool();
        
        // Get the flyweights and run diagnostics on them
        Engine standard1 = factory.getStandardEngine(1300);
        standard1.diagnose(tool);

        Engine standard2 = factory.getStandardEngine(1300);
        standard2.diagnose(tool);

        Engine standard3 = factory.getStandardEngine(1300);
        standard3.diagnose(tool);

        Engine standard4 = factory.getStandardEngine(1600);
        standard4.diagnose(tool);

        Engine standard5 = factory.getStandardEngine(1600);
        standard5.diagnose(tool);
        
        // Show that objects are shared
        System.out.println(standard1.hashCode());
        System.out.println(standard2.hashCode());
        System.out.println(standard3.hashCode());
        System.out.println(standard4.hashCode());
        System.out.println(standard5.hashCode());
    }
    
}
