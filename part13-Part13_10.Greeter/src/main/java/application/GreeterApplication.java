package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application{

    @Override
    public void start(Stage window) {
        BorderPane first = new BorderPane();
        VBox layout = new VBox();
        Button presser = new Button("Start");
        TextField name = new TextField();
        layout.getChildren().addAll(new Label("Enter your name and start"), name, presser);
        first.setCenter(layout);
        Scene firstScene = new Scene(first);
        
        BorderPane second = new BorderPane();
        Label nameLabel = new Label("Welcome!");
        second.setCenter(nameLabel);
        
        Scene secondScene = new Scene(second);
        presser.setOnAction((event) -> {
           window.setScene(secondScene);
           String userName = name.getText();
           nameLabel.setText("Welcome " + userName + "!");
        });
        
        
        
        window.setScene(firstScene);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }
}
