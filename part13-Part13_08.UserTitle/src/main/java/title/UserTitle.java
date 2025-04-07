package title;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class UserTitle extends Application{

    @Override
    public void start(Stage window) {
        Parameters params = getParameters();
        String title = params.getNamed().get("title");
        System.out.println(title);
        BorderPane layout = new BorderPane();
        
        layout.setTop(new Label("NORTH"));
        layout.setRight(new Label("EAST"));
        layout.setBottom(new Label("SOUTH"));
        
        Scene view = new Scene(layout);
        
        window.setTitle(title);
        window.show();
    }

}
