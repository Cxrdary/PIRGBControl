package led.lightstrip.scrum5.pidev.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
        // Initialize the ColorPickers with default colors
        cp1.setValue(null);
        cp2.setValue(null);
        cp3.setValue(null);

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
}

