package chapterEight.TicTacToe;

public class WinnerCondition {
    char[][] board = Board.board;
    public boolean Winner() {

        if (board[0][0] != '_' && board[0][0] == board[0][1] && board[0][0] == board[0][2])
            return false;
        if (board[1][0] != '_' && board[1][0] == board[1][1] && board[1][0] == board[1][2])
            return false;
        if (board[2][0] != '_' && board[2][0] == board[2][1] && board[2][0] == board[2][2])
            return false;
        if (board[0][0] != '_' && board[0][0] == board[1][0] && board[0][0] == board[2][0])
            return false;
        if (board[0][1] != '_' && board[0][1] == board[1][1] && board[0][1] == board[2][1])
            return false;
        if (board[0][2] != '_' && board[0][2] == board[1][2] && board[0][2] == board[2][2])
            return false;
        if (board[0][0] != '_' && board[0][0] == board[1][1] && board[0][0] == board[2][2])
            return false;
        if (board[0][2] != '_' && board[0][2] == board[1][1] && board[0][2] == board[2][0])
            return false;

        return true;
    }

}
