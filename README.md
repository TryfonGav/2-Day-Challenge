Odd vs. Even Towers Game

Overview
Odd vs. Even Towers is a Java-based board game for two players, ODD and EVEN. The goal is to complete specified sums in your towers to gain points while avoiding exceeding the limits, which would close a tower. The game continues until all towers are closed, and the player with the most points wins.

This project was created as part of a coursework challenge for CCS1110/CCS1115 at the BSc Computer Science program, Athens. It implements principles of programming methodology, design, and algorithms.

Features:
Random Dice Rolls: Generates a number between 1–12 each round.

Dynamic Gameplay: Players choose a tower to allocate the dice roll based on their strategy.

Score Tracking: Points are awarded for achieving exact sums (31 for ODD, 32 for EVEN).

Tower Management: Towers become closed if their sum exceeds the limit, adding strategic complexity.

Victory Conditions: The game ends when all towers are closed, and the player with the highest score wins.



How to Play:
Launch the game: Run the program in your Java IDE or command line.

Dice Roll: A random number between 1 and 12 is rolled each round.

Player Turn: Based on the dice roll:

If the number is odd, the ODD player plays.

If the number is even, the EVEN player plays.

Tower Selection: The player selects one of their two towers to allocate the number.

Towers gain points as numbers are added.

A tower that exceeds the limit becomes closed.

Scoring: Achieving the exact limit empties the tower and awards 100 points.

Game End: The game concludes when all towers are closed. The player with the highest score is declared the winner.

Requirements:
Java 8 or higher
Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans) or command-line Java runtime environment.

Installation and Execution:
Clone this repository:
bash
git clone https://github.com/your-username/odd-even-towers.git
cd odd-even-towers

Compile the source file:
javac towerBoardGame.java
Run the game:
bash

java towerBoardGame
Acknowledgements
This project was developed by:

Kostas Plassaras
Tryfonas Gavrilis
Panos Chologkitas
Stergios Fotoglou
Created using the "Code with Me" feature in IntelliJ IDEA.

Learning Outcomes:
Using user-defined methods in Java.
Implementing arrays and 2D arrays for data handling.
Breaking a problem into smaller, manageable tasks.
Designing dynamic gameplay with input validation and randomized events.
License
This project is licensed under the MIT License. See the LICENSE file for details.
