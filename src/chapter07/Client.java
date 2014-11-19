/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter07;

import chapter01.*;
import java.util.*;

public class Client {
    
    public static void main(String[] args) {
        List<Engine> engines = new ArrayList<Engine>();
        
        engines.add(new StandardEngine(1300));
        engines.add(new StandardEngine(1600));
        engines.add(new TurboEngine(2000));
        
        // "Adapt" the new engine type...
        SuperGreenEngine greenEngine = new SuperGreenEngine(1200);
        engines.add(new SuperGreenEngineAdapter(greenEngine));
        
        for (Engine engine : engines) {
            System.out.println(engine);
        }
    }
    
}
