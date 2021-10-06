package chapterEight.TicTacToe;

import java.util.Scanner;

public class GameClass {
    Player playerChanger = new Player();
    WinnerCondition winner = new WinnerCondition();
    Scanner input = new Scanner(System.in);
    char[][] board = Board.board;
    Board place = new Board();
    private int row, col;
    void StartGame() {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }


        place.printBoard();
        while (winner.Winner()) {
            System.out.println("player");
            System.out.println("select the row you want to play");
            row = input.nextInt();
            System.out.println("select the column you want to play");
            col = input.nextInt();
            System.out.println("second players turn");
            if (row > 3 || col > 3) {
                System.out.println("You've inputed place, which is out of the board!\nTry again!");

            } else {
                if (place.isBoardFull(row, col)) {
                    System.err.println("The place is taken");

                } else {
                    board[row - 1][col - 1] = playerChanger.getTurn();
                    place.printBoard();
                    playerChanger.whichPlayer();
                }

            }


        }
        playerChanger.whichPlayer();
        System.out.println("the winner is " + playerChanger.getTurn());
    }
}
