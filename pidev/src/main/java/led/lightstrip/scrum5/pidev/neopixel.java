package led.lightstrip.scrum5.pidev;

public class neopixel extends Device {

    // need to make classes for different light strip types

    // default values
    public neopixel() {
        super("neopixel", 18, 255, 30);
    }


    public void play_pattern1 (){
        System.out.println("Playing pattern 1");
        // led_strip = Adafruit_NeoPixel(LED_COUNT, LED_PIN, LED_FREQ_HZ, LED_DMA, LED_INVERT, LED_BRIGHTNESS, LED_CHANNEL, LED_STRIP);
        // led_strip.begin();
        // led_strip.show();
        // for (int i = 0; i < led_strip.numPixels(); i++) {
        //     led_strip.setPixelColor(i, led_strip.Color(0, 150, 0));
        //     led_strip.show();
        //     delay(50);
        // }

        // for (int i = 0; i < led_strip.numPixels(); i++) {
    }

    public void play_pattern2 (){
        System.out.println("Playing pattern 2");
        // led_strip = Adafruit_NeoPixel(LED_COUNT, LED_PIN, LED_FREQ_HZ, LED_DMA, LED_INVERT, LED_BRIGHTNESS, LED_CHANNEL, LED_STRIP);
        // led_strip.begin();
        // led_strip.show();
        // for (int i = 0; i < led_strip.numPixels(); i++) {
        //     led_strip.setPixelColor(i, led_strip.Color(0, 0, 150));
        //     led_strip.show();
        //     delay(50);
        // }

        // for (int i = 0; i < led_strip.numPixels(); i++) {
    }
}
