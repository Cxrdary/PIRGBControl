package led.lightstrip.scrum5.pidev;

import models.Device;

public class neopixel extends models.Device {

    // need to make classes for different light strip types

    // default values
    public neopixel() {
        super("neopixel", 18, 255, 30);
    }

}
