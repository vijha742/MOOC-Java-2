package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{

    @Override
    public void start(Stage window) {
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        HBox buttonSection = new HBox();
        buttonSection.getChildren().addAll(joke,answer,explanation);
        BorderPane screen = new BorderPane();
        screen.setTop(buttonSection);
                
        StackPane jokePane = new StackPane();
        jokePane.getChildren().add(new Label("What do you call a bear with no teeth?"));
        StackPane answerPane = new StackPane();
        answerPane.getChildren().add(new Label("A gummy bear."));
        StackPane explanationPane = new StackPane();
        explanationPane.getChildren().add(new Label("Because it has only gums"));
        
        screen.setCenter(jokePane);
        
        joke.setOnAction((event) -> screen.setCenter(jokePane));
        answer.setOnAction((event) -> screen.setCenter(answerPane));
        explanation.setOnAction((event) -> screen.setCenter(explanationPane));
        
        Scene first = new Scene(screen);
        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }
}
