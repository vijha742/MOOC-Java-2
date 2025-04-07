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
public class Board {
    private char[][] grid;
    
    public Board() {
        this.grid = new char[3][3];
    }
    
    public boolean boardFull() {
        for (char[] is : grid) {
            for (int i : is) {
                if(i != 'O' && i != 'X') {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean sameRow3(char counter) {
        for (int i = 0; i < 2; i++) {
            if(this.grid[i][0] == counter && this.grid[i][1] == counter && this.grid[i][2] == counter) {
                return true;
            }
        }
        return false;
    }
    
    public boolean sameColumn3(char counter) {
        for (int i = 0; i < 2; i++) {
            if(this.grid[0][i] == counter && this.grid[1][i] == counter && this.grid[2][i] == counter) {
                return true;
            }
        }
        return false;
    }
    
    public boolean sameDiagonal3(char counter) {
        if(this.grid[0][0] == counter && this.grid[1][1] == counter && this.grid[2][2] == counter) {
            return true;
        } else if(this.grid[0][2] == counter && this.grid[1][1] == counter && this.grid[2][0] == counter) {
            return true;
        }
        return false;
    }
    
    public void enterChar(char turn, int x, int y) {
        grid[x][y] = turn;
    }
    
}
