package led.lightstrip.scrum5.pidev.controllers;

import led.lightstrip.scrum5.pidev.Device;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PiDeviceController {
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
