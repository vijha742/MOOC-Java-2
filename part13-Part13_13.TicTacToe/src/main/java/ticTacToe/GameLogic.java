/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author vikas
 */
public class GameLogic {
    private Board board;
    private char turn;
    
    public GameLogic() {
        this.board = new Board();
        this.turn = 'X';
    }
    
    public String getTurn() {
        if(this.turn == 'X') return "X";
                else return "O";
    }
    
    public void changeTurn() {
        if(this.turn == 'X') {
            this.turn = 'O';
        } else this.turn = 'X';
    }
    
    public boolean boardFull() {
        return this.board.boardFull();
    }
    
    // presses x -> is it valid to move -> if no, do again -> if yes, {is board full} then label match tie {if winning sequence} then turn Won {else} change turn and Label
    
    public boolean gameWon() {
        return this.board.sameColumn3(turn) || board.sameDiagonal3(turn) || board.sameRow3(turn);
    }
    
    public void enterChar(int x, int y) {
        board.enterChar(turn, x, y);
    }
    
    public boolean gameOver() {
        return boardFull() || gameWon();
    } 
    
}
