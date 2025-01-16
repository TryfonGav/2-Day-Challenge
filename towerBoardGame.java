import java.util.*;

public class towerBoardGame {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        Random rand = new Random();

        String playerType;

        int oddLimit = 31;
        int evenLimit = 32;

        int[][] towers = {
                {0, 0}, //Even Towers (1-2)
                {0, 0}  //Odd Towers (1,2)
        };
        boolean[][] towerOpen = {
                {true, true}, //Even Towers Condition
                {true, true}  //Odd Towers -//-
        };

        int oddPlayerScore = 0;
        int evenPlayerScore = 0;

        while ((towerOpen[0][0]) || (towerOpen[0][1]) || towerOpen[1][0] || towerOpen[1][1]) {



            int mainDice = rand.nextInt(12) + 1; //Random dice roll (1-12)
            System.out.println("Random number drawn " + mainDice);

            if (mainDice % 2 == 0) {
                System.out.println("Even plays. ");
                playerType = "EVEN ";
                playerTurn(towers[0], towerOpen[0], evenLimit, mainDice, playerType);

                if (towers[0][0] == evenLimit) { //even
                    towers[0][0] = 0;
                    evenPlayerScore += 100;
                } else if (towers[0][1] == evenLimit) {
                    towers[0][1] = 0;
                    evenPlayerScore += 100;
                }
            } else { //odd
                System.out.println("Odd plays. ");
                playerType = "ODD ";
                playerTurn(towers[1], towerOpen[1], oddLimit, mainDice, playerType);
                if (towers[1][0] == oddLimit) {
                    towers[1][0] = 0;
                    oddPlayerScore += 100;
                } else if (towers[1][1] == oddLimit) {
                    towers[1][1] = 0;
                    oddPlayerScore += 100;
                }
            }


            // TOWER STATS PRINT
            System.out.println("EVEN Towers: " + towers[0][0] + " (open: " + towerOpen[0][0] + "), " + towers[0][1] + " (open: " + towerOpen[0][1] + ")");
            System.out.println("ODD Towers: " + towers[1][0] + " (open: " + towerOpen[1][0] + "), " + towers[1][1] + " (open: " + towerOpen[1][1] + ")");
            System.out.println();


        } //PLAYER POINTS COMPARISON
        if (oddPlayerScore == evenPlayerScore) {
            System.out.println("IT'S A TIE!");

        } else if (oddPlayerScore > evenPlayerScore) {
            System.out.println("ODD PLAYER WINS WITH : (" + oddPlayerScore + ") POINTS");
        } else {
            System.out.println("EVEN PLAYER WINS WITH : (" + evenPlayerScore + " POINTS)");
        }
    }

    public static void playerTurn(int[] towers, boolean[] towerOpen, int limitedTowerScore, int methodDice, String typeOfPlayer) {
        Scanner inputs = new Scanner(System.in);
        int userTowerChoice = -1;
        do {
            System.out.println("Choose a tower to place the number " + methodDice + ":");
            for (int i = 0; i < towers.length; i++) {
                System.out.println((i + 1) + ". " + typeOfPlayer + "Tower " + (i + 1) + " (Current: " + towers[i] + ", Open: " + towerOpen[i] + ")");
            }

            System.out.println("Please select Tower 1 or 2 :");
            userTowerChoice = inputs.nextInt() - 1;

            if (!towerOpen[userTowerChoice] == towerOpen[0]) {
                System.out.println("***** Tower " + (userTowerChoice + 1) + " is closed. Please choose another Tower. *****");

                if (!towerOpen[userTowerChoice] == towerOpen[1]) {
                    //input method dice roll

                    userTowerChoice = -1;
                }
            } else if ((userTowerChoice < 0 || userTowerChoice > 2 || !towerOpen[userTowerChoice])) {
                System.out.println("***** Invalid input. Please try again. *****");
                userTowerChoice = -1;
            }
        }
        while (userTowerChoice == -1);
        towers[userTowerChoice] += methodDice;
        if (towers[userTowerChoice] > limitedTowerScore) {
            towerOpen[userTowerChoice] = false;
            System.out.println("Tower " + (userTowerChoice + 1) + " is now closed.");
        }
    }
}