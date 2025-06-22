package game;

import java.util.*;

public class TicTacToe {
    protected static final Scanner sc = new Scanner(System.in);
    protected static final Random rand = new Random();
    protected char[][] gameBoard = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
    };
    protected ArrayList<Integer> playerPositions = new ArrayList<>();
    protected ArrayList<Integer> cpuPositions = new ArrayList<>();

    public void printBoard() {
        for (char[] row : gameBoard) {
            for (char c : row) System.out.print(c);
            System.out.println();
        }
        System.out.println("---------------");
    }

    public void placeMove(int pos, String user) {
        char symbol = user.equalsIgnoreCase("player") ? 'X' : 'O';
        if (user.equalsIgnoreCase("player")) playerPositions.add(pos);
        else cpuPositions.add(pos);

        switch (pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
        }
        printBoard();
    }

    public String checkWinner() {
        List<List<Integer>> winning = Arrays.asList(
                Arrays.asList(1, 4, 7), Arrays.asList(2, 5, 8), Arrays.asList(3, 6, 9),
                Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9),
                Arrays.asList(1, 5, 9), Arrays.asList(3, 5, 7)
        );

        for (List<Integer> win : winning) {
            if (playerPositions.containsAll(win)) return "game.Player wins!";
            if (cpuPositions.containsAll(win)) return "CPU wins!";
        }
        return playerPositions.size() + cpuPositions.size() == 9 ? "TIE" : "";
    }

    protected int getValidInput() {
        while (true) {
            try {
                int pos = Integer.parseInt(sc.nextLine());
                if (pos >= 1 && pos <= 9 && !playerPositions.contains(pos) && !cpuPositions.contains(pos))
                    return pos;
                System.out.println("Invalid or taken position! Try again (1-9): ");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number (1-9): ");
            }
        }
    }
}
