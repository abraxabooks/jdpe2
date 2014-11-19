/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter29.main;

import chapter29.ui.*;
import chapter29.business.*;
import javax.swing.*;

public class Main {
    
    public static void main(String[] args) {
        // create some sample data
        BusinessFacade.INSTANCE.addEngine(1300, EngineFactory.Type.STANDARD);
        BusinessFacade.INSTANCE.addEngine(1600, EngineFactory.Type.STANDARD);
        BusinessFacade.INSTANCE.addEngine(2000, EngineFactory.Type.STANDARD);
        BusinessFacade.INSTANCE.addEngine(2500, EngineFactory.Type.TURBO);
        
        // start the ui
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EnginesFrame().setVisible(true);
            }
        });
    }
    
}
