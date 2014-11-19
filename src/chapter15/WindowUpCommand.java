/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter15;

public class WindowUpCommand implements Command {
    
    private ElectricWindow window;
    
    public WindowUpCommand(ElectricWindow window) {
        this.window = window;
    }

    @Override
    public void execute() {
        window.closeWindow();
    }
    
}
