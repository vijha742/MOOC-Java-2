package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


// END SOLUTION
public class VocabularyPracticeApplication extends Application{

    @Override
    public void start(Stage window) {
        DictionaryOperations first = new DictionaryOperations();
        Practice second = new Practice(first.getDictionary());
        BorderPane view = new BorderPane();
        Button words = new Button("Enter new words");
        Button practice = new Button("Practice");
        HBox topBox = new HBox();
        topBox.getChildren().addAll(words,practice);
        view.setTop(topBox);
        StackPane starter = first.getScreen();
        view.setCenter(starter);
        Scene layout = new Scene(view);
        window.setScene(layout);
        window.show();
        
        words.setOnAction((event) -> view.setCenter(first.getScreen()));
        practice.setOnAction((event) -> {
            if(first.getDictionary().size() > 0) {
                view.setCenter(second.getScreen());
            }   
        });
    }

    public static void main(String[] args) {
        System.out.println("Starting...");
        launch(VocabularyPracticeApplication.class);
    }
}
