package led.lightstrip.scrum5.pidev;

public class Device {
    public String deviceName;
    public int gpioPin;
    public int brightness;
    public int pixels;
    public Device(String deviceName, int gpioPin, int brightness, int pixels){
        this.deviceName = deviceName;
        this.gpioPin = gpioPin;
        this.brightness = brightness;
        this.pixels = pixels;
    }
    @Override
    public String toString() {
        return String.format("""
                    Device: {
                        name: %s
                        GPIO: %d
                        Brightness: %d
                        Pixels: %d""",deviceName, gpioPin, brightness,pixels);
    }


    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setGpioPin(int gpioPin) {
        this.gpioPin = gpioPin;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setPixels(int pixels) {
        this.pixels = pixels;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public int getGpioPin() {
        return gpioPin;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getPixels() {
        return pixels;


    }


}
