/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter14;

public abstract class AbstractEmailHandler implements EmailHandler {
    
    public static void handle(String email) {
        // Create the handler objects...
        EmailHandler spam = new SpamEmailHandler();
        EmailHandler sales = new SalesEmailHandler();
        EmailHandler service = new ServiceEmailHandler();
        EmailHandler manager = new ManagerEmailHandler();
        EmailHandler general = new GeneralEnquiriesEmailHandler();
        
        // Chain them together...
        spam.setNextHandler(sales);
        sales.setNextHandler(service);
        service.setNextHandler(manager);
        manager.setNextHandler(general);
        
        // Start the ball rolling...
        spam.processHandler(email);
    }
    
    private EmailHandler nextHandler;
    
    public void setNextHandler(EmailHandler handler) {
        nextHandler = handler;
    }
    
    public void processHandler(String email) {
        boolean wordFound = false;
        
        // If no words to match against then this object can handle
        if (matchingWords().length == 0) {
            wordFound = true;
        
        } else {
            // Look for any of the matching words
            for (String word : matchingWords()) {
                if (email.indexOf(word) >= 0) {
                    wordFound = true;
                    break;
                }
            }
        }
        
        // Can we handle emai in this object?
        if (wordFound) {
            handleHere(email);
        
        } else {
            // Unable to handle here so forward to next in chain
            nextHandler.processHandler(email);
        }
    }
    
    protected abstract String[] matchingWords();
    protected abstract void handleHere(String email);
    
}
