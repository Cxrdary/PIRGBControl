package led.lightstrip.scrum5.pidev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class PidevApplication {




	public static void main(String[] args) {
		SpringApplication.run(PidevApplication.class, args);

		factory factory = new factory();
		Device device = factory.factory("neopixel");

		device.setDeviceName("RASPBERRIES");
		device.setGpioPin(22);
		device.setBrightness(255);
		device.setPixels(22);


		/*
            Sketching out some ideas for the UI:

		button.implementListener(onClick -> {

		    network post request to /devices/configure
			device.setBrightness(0);
			device.play_pattern1();


		});

		button2.implementListener(onClick -> {
			device.setBrightness(255);
			device.play_pattern2();
		});

		 */


		System.out.println(device.toString());



	}

}
