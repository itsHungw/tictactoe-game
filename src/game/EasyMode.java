package game;

public class EasyMode extends TicTacToe {
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

            int cpuPos;
            do {
                cpuPos = rand.nextInt(9) + 1;
            } while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos));
            System.out.println("CPU chooses: " + cpuPos);
            placeMove(cpuPos, "cpu");
            result = checkWinner();
            if (!result.isEmpty()) {
                System.out.println(result);
                break;
            }
        }
    }
}