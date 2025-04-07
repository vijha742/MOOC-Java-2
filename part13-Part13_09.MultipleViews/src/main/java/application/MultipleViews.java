package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    @Override
    public void start(Stage window) {
        BorderPane first = new BorderPane();
        Button buttonOne = new Button("To the second view!");
        first.setTop(new Label("First view!"));
        first.setCenter(buttonOne);
        Scene firstScene = new Scene(first);
        window.setScene(firstScene);
        
        VBox second = new VBox();
        Button buttonTwo = new Button("To the third view!");
        second.getChildren().addAll(buttonTwo, new Label("Second view!"));
        Scene secondScene = new Scene(second);
        
        GridPane third = new GridPane();
        third.add(new Label("Third view!"), 0, 0);
        Button buttonThree = new Button("To the first view!");
        third.add(buttonThree, 1, 1);
        Scene thirdScreen = new Scene(third);
        
        buttonOne.setOnAction((event) -> {
            window.setScene(secondScene);
        });
        
        buttonTwo.setOnAction((event) -> {
            window.setScene(thirdScreen);
        });
        
        buttonThree.setOnAction((event) -> {
            window.setScene(firstScene);
        });
        
        
        window.show();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

}
