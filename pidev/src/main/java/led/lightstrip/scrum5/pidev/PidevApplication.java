package led.lightstrip.scrum5.pidev;

import models.Device;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PidevApplication {




	public static void main(String[] args) {
		SpringApplication.run(PidevApplication.class, args);


		// testing factory
		Device myDevice = new factory().createDevice("neopixel");
		myDevice.setDeviceName("DOOBEE");
		myDevice.setGpioPin(18);
		myDevice.setBrightness(22);
		myDevice.setPixels(33);
		System.out.println(myDevice.toString());




	}

}
