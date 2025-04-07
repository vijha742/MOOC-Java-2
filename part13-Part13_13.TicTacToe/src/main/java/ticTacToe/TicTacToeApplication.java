package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application{

    @Override
    public void start(Stage window) {
        GameLogic rules = new GameLogic();
        BorderPane layout = new BorderPane();
        Label guideText = new Label("Turn: X");
        GridPane grid = new GridPane();
        Button presser1 = new Button(" ");
        Button presser2 = new Button(" ");
        Button presser3 = new Button(" ");
        Button presser4 = new Button(" ");
        Button presser5 = new Button(" ");
        Button presser6 = new Button(" ");
        Button presser7 = new Button(" ");
        Button presser8 = new Button(" ");
        Button presser9 = new Button(" ");
        
        presser1.setFont(Font.font("Monospaced", 40));
        presser2.setFont(Font.font("Monospaced", 40));
        presser3.setFont(Font.font("Monospaced", 40));
        presser4.setFont(Font.font("Monospaced", 40));
        presser5.setFont(Font.font("Monospaced", 40));
        presser6.setFont(Font.font("Monospaced", 40));
        presser7.setFont(Font.font("Monospaced", 40));
        presser8.setFont(Font.font("Monospaced", 40));
        presser9.setFont(Font.font("Monospaced", 40));
        
        grid.add(presser1, 0, 0);
        grid.add(presser2, 0, 1);
        grid.add(presser3, 0, 2);
        grid.add(presser4, 1, 0);
        grid.add(presser5, 1, 1);
        grid.add(presser6, 1, 2);
        grid.add(presser7, 2, 0);
        grid.add(presser8, 2, 1);
        grid.add(presser9, 2, 2);
        
        presser1.setOnAction((event) -> {
            if(presser1.getText().equals(" ") && !rules.gameOver()) {
                presser1.setText(rules.getTurn());
                rules.enterChar(0,0);
                if(rules.gameOver()) {
                    guideText.setText("The end!");
                } else { 
                    rules.changeTurn();
                    guideText.setText("Turn: " + rules.getTurn());
                }
            }
        });
        
        presser2.setOnAction((event) -> {
            if(presser2.getText().equals(" ") && !rules.gameOver()) {
                presser2.setText(rules.getTurn());
                rules.enterChar(0,1);
                if(rules.gameOver()) {
                    guideText.setText("The end!");
                } else {
                    rules.changeTurn();
                    guideText.setText("Turn: " + rules.getTurn());
                }
            }
        });
        presser3.setOnAction((event) -> {
            if(presser3.getText().equals(" ") && !rules.gameOver()) {
                presser3.setText(rules.getTurn());
                rules.enterChar(0,2);
                if(rules.gameOver()) {
                    guideText.setText("The end!");
                } else {
                    rules.changeTurn();
                    guideText.setText("Turn: " + rules.getTurn());
                }
            }
        });presser4.setOnAction((event) -> {
            if(presser4.getText().equals(" ") && !rules.gameOver()) {
                presser4.setText(rules.getTurn());
                rules.enterChar(1,0);
                if(rules.gameOver()) {
                    guideText.setText("The end!");
                } else {
                    rules.changeTurn();
                    guideText.setText("Turn: " + rules.getTurn());
                }
            }
        });presser5.setOnAction((event) -> {
            if(presser5.getText().equals(" ") && !rules.gameOver()) {
                presser5.setText(rules.getTurn());
                rules.enterChar(1,1);
                if(rules.gameOver()) {
                    guideText.setText("The end!");
                } else {
                    rules.changeTurn();
                    guideText.setText("Turn: " + rules.getTurn());
                }
            }
        });presser6.setOnAction((event) -> {
            if(presser6.getText().equals(" ") && !rules.gameOver()) {
                presser6.setText(rules.getTurn());
                rules.enterChar(1,2);
                if(rules.gameOver()) {
                    guideText.setText("The end!");
                } else {
                    rules.changeTurn();
                    guideText.setText("Turn: " + rules.getTurn());
                }
            }
        });presser7.setOnAction((event) -> {
            if(presser7.getText().equals(" ") && !rules.gameOver()) {
                presser7.setText(rules.getTurn());
                rules.enterChar(2,0);
                if(rules.gameOver()) {
                    guideText.setText("The end!");
                } else {
                    rules.changeTurn();
                    guideText.setText("Turn: " + rules.getTurn());
                }
            }
        });presser8.setOnAction((event) -> {
            if(presser8.getText().equals(" ") && !rules.gameOver()) {
                presser8.setText(rules.getTurn());
                rules.enterChar(2,1);
                if(rules.gameOver()) {
                    guideText.setText("The end!");
                } else {
                    rules.changeTurn();
                    guideText.setText("Turn: " + rules.getTurn());
                }
            }
        });presser9.setOnAction((event) -> {
            if(presser9.getText().equals(" ") && !rules.gameOver()) {
                presser9.setText(rules.getTurn());
                rules.enterChar(2,2);
                if(rules.gameOver()) {
                    guideText.setText("The end!");
                } else {
                    rules.changeTurn();
                    guideText.setText("Turn: " + rules.getTurn());
                }
            }
        });
//        presser1.setText("O");
//        presser2.setText("O");
//        presser3.setText("O");
//        presser4.setText("X");
//        presser5.setText("X");
//        presser6.setText("X");
//        presser7.setText("O");
//        presser8.setText("O");
//        presser9.setText("O");
        layout.setTop(guideText);
        layout.setCenter(grid);
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
    }

}
