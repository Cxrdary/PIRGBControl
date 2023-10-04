package led.lightstrip.scrum5.pidev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		System.out.println(device.toString());



	}

}
