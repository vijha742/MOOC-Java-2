/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author vikas
 */
public class DictionaryOperations {
    private Dictionary dictionary;
    
    public DictionaryOperations() {
        this.dictionary = new Dictionary();
    }
    
    public StackPane getScreen() {
        StackPane layout = new StackPane();
        VBox stack = new VBox();
        TextField word = new TextField();
        TextField translation = new TextField();
        Button adder = new Button("Add the word pair"); 
        stack.getChildren().addAll(new Label("Word"), word, new Label("Translation"), translation, adder);
        layout.getChildren().add(stack);
        adder.setOnAction((event) -> this.dictionary.add(word.getText(),translation.getText()));
        return layout;
    }
    
    public Dictionary getDictionary() {
        return this.dictionary;
    }
}
