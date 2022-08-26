package javapractice.tic_tac_toe_game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TicTacToeFunctionality ticTacToe = new TicTacToeFunctionality();
        Scanner inputReader = new Scanner(System.in);

        System.out.println("                 !!   Start Game    !!");

        ticTacToe.printBoard();

        Character ch = 'X';

        while(true){
            System.out.println("It's turn of "+ch);
            System.out.println("Enter position or index: ");
            int index = inputReader.nextInt();

            ticTacToe.fillBoardIndex(index,ch);

            String check = ticTacToe.gameStatus();

            if(check.equals("w")){
                System.out.println("\n           !!  "+ch+" win   !!");
                break;
            }

            if(check.equals("t")){
                System.out.println("\n        !! game tie  !!");
                break;
            }

            if(ch == 'X')
            ch  = 'O';

            else{
                ch = 'X';
            }
        }

        ticTacToe.exit();

    }
}
