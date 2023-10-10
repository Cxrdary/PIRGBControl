package led.lightstrip.scrum5.pidev.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

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

        // Initialize the Buttons with event handlers
        btn1.setOnAction(event -> handleButton1Action());
        btn2.setOnAction(event -> handleButton2Action());
        btn3.setOnAction(event -> handleButton3Action());

    }

    @FXML
    public void handleButton1Action() {
        // Handle the action for btn1 here
        System.out.println("Setting Color To Red");
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

    @FXML
    public String handleCP1Action(){
        return cp1.getValue().toString();
    }
    @FXML
    public String handleCP2Action(){
        return cp2.getValue().toString();
    }
    @FXML
    public void handleCP3Action(){
        c = cp3.getValue();
        System.out.println(c.getRed());
        // return cp3.getValue().toString();

    }
}

