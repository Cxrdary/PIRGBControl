package led.lightstrip.scrum5.pidev.controllers;

import com.diozero.ws281xj.PixelAnimations;
import com.diozero.ws281xj.LedDriverInterface;
import com.diozero.ws281xj.rpiws281x.WS281x;
import led.lightstrip.scrum5.pidev.Device;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class PiDeviceController {
    int deviceGpioPin = 18;
    int deviceBrightness =255;
    int devicePixels = 22;
    LedDriverInterface led_driver = new WS281x(deviceGpioPin, deviceBrightness, devicePixels);
    @Async
    @GetMapping("/devices/connect")
    public boolean connect() {
        System.out.println("Connecting to device");
        return true;
    }
    @GetMapping("/devices/setRed")
    public void setRed(){
        for (int i=0; i<256; i+=2) {
            for (int pixel=0; pixel<led_driver.getNumPixels(); pixel++) {
                led_driver.setRedComponent(pixel, i);
            }

            led_driver.render();
            PixelAnimations.delay(20);
        }
    }
    @Async
    @GetMapping("/devices/disconnect")
    public boolean disconnect() {
        System.out.println("Disconnecting from device");
        return true;
    }

    @GetMapping("/devices")
    public List<Device> getDevices() {
        System.out.println("Listing Devices");
        return null;
    }
    @PostMapping("/devices/configure")
    public Device configure(@RequestBody Device configureDevice){
        System.out.println(configureDevice.toString());
        return null;
    }
}
