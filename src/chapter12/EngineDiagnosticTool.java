/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter12;

public class EngineDiagnosticTool implements DiagnosticTool {

    public void runDiagnosis(Object obj) {
        System.out.println("Starting engine diagnostic tool for " + obj);
        try {
            Thread.sleep(5000);
            System.out.println("Engine diagnosis complete");
        } catch (InterruptedException ex) {
            System.out.println("Engine diagnosis interrupted");
        }
    }
    
}
