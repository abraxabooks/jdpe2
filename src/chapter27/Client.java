/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter27;

public class Client {
    
    public static void main(String[] args) {
        // Create the MVC classes
        SatNavModel model = new SatNavModel();
        SatNavView view = new SatNavView(model);
        SatNavController controller = new SatNavController(model, view);
        
        // Show the view
        view.show();
    }
    
}
