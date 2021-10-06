package chapterEight.TicTacToe;

public class Player {
    public char turn = 'X';

    public void whichPlayer() {
        if (turn == 'X') {
            turn = 'O';
        } else {
            turn = 'X';

        }
    }

    public char getTurn() {
        return turn;
    }


}


