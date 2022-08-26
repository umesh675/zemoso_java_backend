package javapractice.tic_tac_toe_game;

public class TicTacToeFunctionality {

    private  TicTacToeGame ticTacToeGame;

    public TicTacToeFunctionality(){
        ticTacToeGame = new TicTacToeGame();
    }

    public void fillBoardIndex(int index, char ch){

        char [][] board = ticTacToeGame.getBoard();

        int row = (index-1)/3;
        int col = (index-1)%3;

        if(board[row][col] == 'X' || board[row][col] == 'O'){
            System.out.println("space is already occupied choose another index");
            return;
        }

        board[row][col] = ch;

        printBoard();
    }

    public void printBoard(){

        char [][] board = ticTacToeGame.getBoard();

        System.out.println("|---|---|---|");

        for(int i = 0;i<3;i++){
            System.out.print("|");
            for(int j =0 ;j<3 ;j++){
                System.out.print(" "+board[i][j]+" |");
            }
            System.out.println();
            System.out.println("|---|---|---|");
        }
    }

    public String gameStatus(){

        if(checkWinningStatus()) {
            return "w";
        }
        if(isBoardFill()){
            return "t";
        }

        return "\n             can continue game";
    }
    public boolean checkWinningStatus(){


        char [][] board = ticTacToeGame.getBoard();

        if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2])){
            return true;
        }
        if((board[0][0] == board[1][0]) && (board[1][0] == board[2][0])){
            return true;
        }
        if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2])){
            return true;
        }
        if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2])){
            return true;
        }
        if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2])){
            return true;
        }
        if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2])){
            return true;
        }
        if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1])){
            return true;
        }
        if((board[0][2] == board[1][2]) && (board[1][2] == board[2][2])){
            return true;
        }

        return false;
    }
    public boolean isBoardFill(){

        char [][] board = ticTacToeGame.getBoard();

        for(int row =0 ;row<3 ;row++){
            for(int col =0 ;col<3 ;col++){
                if(board[row][col] != 'O' && board[row][col] != 'X')
                    return false;
            }
        }
        return true;
    }

    public void exit(){
        ticTacToeGame.initializeBoard();
    }
}
