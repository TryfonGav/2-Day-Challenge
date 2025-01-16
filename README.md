# Odd vs. Even Towers Game

## 🎮 Overview
**Odd vs. Even Towers** is a Java-based board game for two players, **ODD** and **EVEN**. The objective is to strategically manage towers, complete target sums, and score points without exceeding tower limits. The game ends when all towers are closed, and the player with the highest score wins.

This project was developed as part of a coursework challenge for the CCS1110/CCS1115 modules in the **BSc Computer Science** program at Athens.

---

## ✨ Features
- 🎲 **Random Dice Rolls:** Generates a random number (1–12) each round.
- 🏰 **Tower Management:** Choose between two towers to allocate your dice roll.
- 🏆 **Scoring System:** Earn 100 points for achieving exact sums (31 for ODD, 32 for EVEN).
- 🚫 **Tower Closing:** Towers exceeding their limit are closed permanently.
- 🥇 **Winning Conditions:** The player with the highest score at the end wins.

---

## 🎯 How to Play
1. **Start the Game:** Run the program in your Java environment.
2. **Dice Roll:** Each round starts with a dice roll (1–12).
3. **Player Turn:** Based on the dice roll:
   - ODD plays for odd numbers.
   - EVEN plays for even numbers.
4. **Allocate Points:** Players choose one of their two towers to place the dice roll.
   - Towers accumulate points as numbers are added.
   - Exact sums award points and reset the tower.
   - Exceeding the limit closes the tower.
5. **End of Game:** When all towers are closed, the player with the highest score wins.

---

## 🛠️ Requirements
- **Java 8** or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans) or a command-line Java runtime environment.



---
🙌 Acknowledgements
This project was collaboratively developed by:

- Kostas Plassaras
- Tryfonas Gavrilis
- Panos Chologkitas
- Stergios Fotoglou
- Created using the "Code with Me" feature in IntelliJ IDEA.

## 🚀 Installation and Execution

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/odd-even-towers.git
   cd odd-even-towers

   📝 License
- This project is licensed under the MIT License. See the LICENSE file for details.

---

---

- javac towerBoardGame.java


- java towerBoardGame
