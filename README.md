Tic-Tac-Toe Game
A simple Java-based Tic-Tac-Toe game with three modes: Player vs Player, Player vs CPU (Easy), and Player vs CPU (Hard).
Features

Player vs Player: Two players take turns on the same device.
Player vs CPU (Easy): CPU makes random moves.
Player vs CPU (Hard): CPU uses a smart strategy to win or block the player.
Console-based interface with a 3x3 grid.

How to Run

Ensure Java is installed.
Compile all .java files in the game package:javac game/*.java


Run the main class:java game.Main


Follow the menu to choose a game mode (1 for PvP, 2 for PvCPU, 3 to exit).

Files

Main.java: Entry point with game mode selection.
TicTacToe.java: Core game logic and board management.
PlayerVsPlayer.java: Handles PvP mode.
EasyMode.java: Implements random CPU moves.
HardMode.java: Implements strategic CPU moves.
