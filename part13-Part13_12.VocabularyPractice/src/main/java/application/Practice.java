/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author vikas
 */
public class Practice {
    private Dictionary dictionary;
    
    public Practice(Dictionary book) {
        this.dictionary = book;
    }
    
    public StackPane getScreen() {
        Random randomizer = new Random();
        StackPane layout = new StackPane();
        Label first = new Label();
        TextField meaning = new TextField();
        Button checker = new Button("Check");
        Label second = new Label();
        String word = this.dictionary.getWord(randomizer.nextInt(this.dictionary.size()));
        first.setText("Translate the word '" + word + "'");
        checker.setOnAction((event) -> {
            if(meaning.getText().equals(this.dictionary.getTranslation(word))) {
                second.setText("Correct!");
            } else {
                second.setText("Incorrect! The correct translation of the word '" + word + "' is '" +this.dictionary.getTranslation(word) + "'");
            }
        });
        VBox view = new VBox();
        view.getChildren().addAll(first, meaning, checker, second);
        layout.getChildren().add(view);
        
        return layout;
    }
}
