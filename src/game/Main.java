package game;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final PlayerVsPlayer pvp = new PlayerVsPlayer();
    private static final EasyMode easy = new EasyMode();
    private static final HardMode hard = new HardMode();

    public static void main(String[] args) {
        while (true) {
            System.out.println("----Tic Tac Toe----");
            System.out.println("1. Player vs Player");
            System.out.println("2. Player vs CPU");
            System.out.println("3. Exit");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    pvp.play();
                    break;
                case "2":
                    playVsCpu();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void playVsCpu() {
        System.out.println("1. Easy Mode (Random)");
        System.out.println("2. Hard Mode (Smart)");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                easy.play();
                break;
            case "2":
                hard.play();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}