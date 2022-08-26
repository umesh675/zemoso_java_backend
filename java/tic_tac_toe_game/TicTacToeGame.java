package javapractice.tic_tac_toe_game;

import java.sql.SQLOutput;

public class TicTacToeGame {

    private char board[][] = new char[3][3];

    public TicTacToeGame(){

        initializeBoard();
    }

    public void initializeBoard(){

        char ch = '1';
        for(int i =0 ;i<3 ;i++){
            for(int j =0 ;j<3 ;j++){

                board[i][j] = ch++;
            }
        }
    }

    public char[][] getBoard(){

        return this.board;
    }




}
