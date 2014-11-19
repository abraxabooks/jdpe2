/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter16;

public class Client {
    
    public static void main(String[] args) {
        // Create the evaluator
        DirectionalEvaluator evaluator = new DirectionalEvaluator();
        
        // This should output "London"...
        System.out.println(evaluator.evaluate
                ("london edinburgh manchester southerly"));
        
        // This should output "Aberdeen"...
        System.out.println(evaluator.evaluate
                ("london edinburgh manchester southerly aberdeen westerly"));
    }
    
}
