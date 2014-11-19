/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter03;

import chapter01.*;

public abstract class VehicleBuilder {
    
    public void buildBody() {}
    public void buildBoot() {}
    public void buildChassis() {}
    public void buildPassengerArea() {}
    public void buildReinforcedStorageArea() {}
    public void buildWindows() {}
    
    public abstract Vehicle getVehicle();
    
}
