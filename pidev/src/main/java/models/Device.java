package models;

public class Device {
    private String deviceName;
    private int gpioPin;
    private int brightness;
    private int pixels;
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
