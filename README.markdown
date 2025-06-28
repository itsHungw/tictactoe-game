# Tic-Tac-Toe Game

A simple Java-based Tic-Tac-Toe game with three modes: Player vs Player, Player vs CPU (Easy), and Player vs CPU (Hard).

## Features
- **Player vs Player**: Two players take turns on the same device.
- **Player vs CPU (Easy)**: CPU makes random moves.
- **Player vs CPU (Hard)**: CPU uses a (not realy ) smart strategy to win or block the player.
- Console-based interface with a 3x3 grid.

## How to Run
1. Ensure Java is installed.
2. Compile all `.java` files in the `game` package:
   ```bash
   javac game/*.java
   ```
3. Run the main class:
   ```bash
   java game.Main
   ```
4. Follow the menu to choose a game mode (1 for PvP, 2 for PvCPU, 3 to exit).

## Files
- `Main.java`: Entry point with game mode selection.
- `TicTacToe.java`: Core game logic and board management.
- `PlayerVsPlayer.java`: Handles PvP mode.
- `EasyMode.java`: Implements random CPU moves.
- `HardMode.java`: Implements strategic CPU moves.
