package at.ac.hcw;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static final String TITLE = "SLB_cs_dc";

    @Override
    public void start(Stage stage) {
        var root = new StackPane(new Label("Hello, JavaFX!"));
        stage.setTitle(TITLE);
        stage.setScene(new Scene(root, 640, 480));
        stage.show();

        
        //*Hier kann dann alles verbunden werden mit den Prep einstellungen wie z.b das Zeitlimit pro runde, wäre nur dumm jetzt schon 
        // zu machen wo ich nichts verbinden kann ;-; */
    }
}
