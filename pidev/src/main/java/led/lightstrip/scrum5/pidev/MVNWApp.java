package led.lightstrip.scrum5.pidev;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import led.lightstrip.scrum5.pidev.controllers.MVNWController;
import java.util.Objects;


public class MVNWApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mvnw.fxml")));

        Scene scene = new Scene(root, 600, 400); // Set the preferred width and height
        primaryStage.setScene(scene);
        primaryStage.setTitle("MVNW App");
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);

    }
}

