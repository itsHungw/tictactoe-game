package game;

import game.TicTacToe;

public class PlayerVsPlayer extends TicTacToe {
    public void play() {
        playerPositions.clear();
        cpuPositions.clear();
        printBoard();
        while (true) {
            System.out.print("Player 1 turn (1-9): ");
            placeMove(getValidInput(), "player");
            String result = checkWinner();
            if (!result.isEmpty()) {
                System.out.println(result.replace("Player", "Player 1"));
                break;
            }

            System.out.print("Player 2 turn (1-9): ");
            placeMove(getValidInput(), "cpu");
            result = checkWinner();
            if (!result.isEmpty()) {
                System.out.println(result.replace("CPU", "Player 2"));
                break;
            }
        }
    }
}