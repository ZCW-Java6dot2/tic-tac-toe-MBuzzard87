package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;

    }

    public Boolean isInFavorOfX() {

        boolean xWins = false;

         if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' ||
                 board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' ||
                 board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' ||
                 board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
                 board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X' ||
                 board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ||
                 board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' ||
                 board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
             xWins = true;
         }


        return xWins;
    }

    public Boolean isInFavorOfO() {

        boolean oWins = false;
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' ||
                board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' ||
                board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' ||
                board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||
                board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O' ||
                board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' ||
                board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' ||
                board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            oWins = true;
        }


        return oWins;

    }


    public Boolean isTie() {

        boolean tie = false;

        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' ||
                board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' ||
                board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' ||
                board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||
                board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O' ||
                board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' ||
                board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' ||
                board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            tie = false;
        } else if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' ||
                board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' ||
                board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' ||
                board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
                board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X' ||
                board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ||
                board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' ||
                board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            tie = false;
        } else {
            tie = true;
        }

        return tie;
    }


    public String getWinner() {

        String winner = "";

        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' ||
                board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' ||
                board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' ||
                board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||
                board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O' ||
                board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' ||
                board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' ||
                board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            winner = "O";
        } else if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' ||
                board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' ||
                board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' ||
                board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
                board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X' ||
                board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ||
                board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' ||
                board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            winner = "X";
        }




        return winner;
    }


}
