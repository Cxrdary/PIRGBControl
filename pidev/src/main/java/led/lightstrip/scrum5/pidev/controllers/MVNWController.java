package led.lightstrip.scrum5.pidev.controllers;

import com.diozero.ws281xj.LedDriverInterface;
import com.diozero.ws281xj.PixelAnimations;
import com.diozero.ws281xj.rpiws281x.WS281x;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;

public class MVNWController {

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private ColorPicker cp1;
    @FXML
    private ColorPicker cp2;
    @FXML
    private ColorPicker cp3;
    private int delay = 20;


    @FXML
    public void initialize() {

        cp1.setOnAction(event -> {
            javafx.scene.paint.Color selectedColor = cp1.getValue();
            String hexValue = String.format("#%02X%02X%02X",
                    (int) (selectedColor.getRed() * 255),
                    (int) (selectedColor.getGreen() * 255),
                    (int) (selectedColor.getBlue() * 255));
            System.out.println("Selected color hex value: " + hexValue);
        });
        cp2.setOnAction(event -> {
            javafx.scene.paint.Color selectedColor = cp2.getValue();
            String hexValue = String.format("#%02X%02X%02X",
                    (int) (selectedColor.getRed() * 255),
                    (int) (selectedColor.getGreen() * 255),
                    (int) (selectedColor.getBlue() * 255));
            System.out.println("Selected color hex value: " + hexValue);
        });
        cp3.setOnAction(event -> {
            javafx.scene.paint.Color selectedColor = cp3.getValue();
            String hexValue = String.format("#%02X%02X%02X",
                    (int) (selectedColor.getRed() * 255),
                    (int) (selectedColor.getGreen() * 255),
                    (int) (selectedColor.getBlue() * 255));
            System.out.println("Selected color hex value: " + hexValue);

        });

       /* // Initialize the Buttons with event handlers
        btn1.setOnAction(event -> {

              for (int i=0; i<256; i+=2) {
                for (int pixel=0; pixel<led_driver.getNumPixels(); pixel++) {
                    led_driver.setRedComponent(pixel, i);
                }

                led_driver.render();
                PixelAnimations.delay(delay);
            }
        });
        btn2.setOnAction(event -> {
            for (int i=0; i<256; i+=2) {
                for (int pixel=0; pixel<led_driver.getNumPixels(); pixel++) {
                    led_driver.setGreenComponent(pixel, i);
                }

                led_driver.render();
                PixelAnimations.delay(delay);
            }
        });
        btn3.setOnAction(event -> {
            for (int i=0; i<256; i+=2) {
                for (int pixel=0; pixel<led_driver.getNumPixels(); pixel++) {
                    led_driver.setBlueComponent(pixel, i);
                }

                led_driver.render();
                PixelAnimations.delay(delay);
            }
        });
*/
    }

    @FXML
    public void handleButton2Action() {
        // Handle the action for btn2 here
        System.out.println("Setting Color To Green");
    }

    @FXML
    public void handleButton3Action() {
        // Handle the action for btn3 here
        System.out.println("Setting Color To Blue");
    }

}