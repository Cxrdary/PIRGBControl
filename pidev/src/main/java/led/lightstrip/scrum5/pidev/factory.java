package led.lightstrip.scrum5.pidev;

public class factory {
    String LedType;
    Device device;

    Device factory(String LedType) {

        System.out.println("factory constructor called");

        this.LedType = LedType;

        return createDevice(LedType);
    }



    // createDevice() takes a string and returns a Device object

    public Device createDevice(String s) {

        if( s == "neopixel"){
            //default values
            return new neopixel();


        } else if (s == "ws2812b") {

        } else if (s == "ws2813") {

        } else if (s == "ws2815") {

        } else if (s == "ws2818") {

        } else if (s == "ws2811") {

        } else if (s == "ws2811_400") {

        } else if (s == "ws2811_800") {

        } else if (s == "ws2811_800khz") {

        } else if (s == "ws2811_400khz") {

        } else if (s == "ws2811_400_fast") {

        } else if (s == "ws2811_800_fast") {

        } else if (s == "ws2811_800khz_fast") {

        } else if (s == "ws2811_400khz_fast") {

        } else if (s == "ws2811_400_portrait") {

        } else if (s == "ws2811_800_portrait") {

        } else if (s == "ws2811_800khz_portrait") {

        } else if (s == "ws2811_400khz_portrait") {

        } else if (s == "ws2811_400_fast_portrait") {

        } else if (s == "ws2811_800_fast_portrait") {

        } else if (s == "ws2811_800khz_fast_portrait") {

        } else if (s == "ws2811_400khz_fast_portrait") {

        } else if (s == "ws2811_400_cps") {

        } else if (s == "ws2811_800_cps") {

        } else if (s == "ws2811_800khz_cps") {

        } else if (s == "ws2811_400khz_cps") {

        } else if (s == "ws2811_400_fast_cps") {

        } else if (s == "ws2811_800_fast_cps") {

        } else if (s == "ws2811_800khz_fast_cps") {

        } else  {
            System.out.println("error");

        }
        return null;
    }
}
