/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter15;

public class SpeechRecogniser {
    
    private Command upCommand, downCommand;
    
    public void setCommands(Command upCommand, Command downCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }
    
    public void hearUpSpoken() {
        upCommand.execute();
    }
    
    public void hearDownSpoken() {
        downCommand.execute();
    }
    
}
