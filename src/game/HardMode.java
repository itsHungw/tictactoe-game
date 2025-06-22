package game;

import java.util.*;

public class HardMode extends TicTacToe {
    public void play() {
        playerPositions.clear();
        cpuPositions.clear();
        printBoard();
        while (true) {
            System.out.print("Your turn (1-9): ");
            placeMove(getValidInput(), "player");
            String result = checkWinner();
            if (!result.isEmpty()) {
                System.out.println(result);
                break;
            }

            int cpuPos = getSmartCpuMove();
            System.out.println("CPU chooses: " + cpuPos);
            placeMove(cpuPos, "cpu");
            result = checkWinner();
            if (!result.isEmpty()) {
                System.out.println(result);
                break;
            }
        }
    }

    private int getSmartCpuMove() {
        // 1. Win if possible
        for (int pos = 1; pos <= 9; pos++) {
            if (!playerPositions.contains(pos) && !cpuPositions.contains(pos)) {
                cpuPositions.add(pos);
                if (checkWinner().equals("CPU wins!")) {
                    cpuPositions.remove((Integer) pos);
                    return pos;
                }
                cpuPositions.remove((Integer) pos);
            }
        }

        // 2. Block player
        for (int pos = 1; pos <= 9; pos++) {
            if (!playerPositions.contains(pos) && !cpuPositions.contains(pos)) {
                playerPositions.add(pos);
                if (checkWinner().equals("Player wins!")) {
                    playerPositions.remove((Integer) pos);
                    return pos;
                }
                playerPositions.remove((Integer) pos);
            }
        }

        // 3. Take center
        if (!playerPositions.contains(5) && !cpuPositions.contains(5)) return 5;

        // 4. Take corners
        List<Integer> corners = Arrays.asList(1, 3, 7, 9);
        List<Integer> availableCorners = new ArrayList<>();
        for (int corner : corners) {
            if (!playerPositions.contains(corner) && !cpuPositions.contains(corner))
                availableCorners.add(corner);
        }
        if (!availableCorners.isEmpty())
            return availableCorners.get(rand.nextInt(availableCorners.size()));

        // 5. Take any position
        for (int pos = 1; pos <= 9; pos++) {
            if (!playerPositions.contains(pos) && !cpuPositions.contains(pos))
                return pos;
        }
        return 1; // Fallback
    }
}