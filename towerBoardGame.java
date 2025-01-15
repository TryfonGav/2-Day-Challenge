import java.util.*;


public class towerBoardGame {
    public static void main(String[] args) {
        int min=1;
        int max=12;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int oddPlayer = 0;
        int evenPlayer = 0;

        boolean oddTower1open = (true);
        boolean oddTower2open = (true);
        boolean evenTower1open = (true);
        boolean evenTower2open = (true);

        int[] oddTower1 = {0};
        int[] oddTower2 = {0};
        int[] evenTower1 = {0};
        int[] evenTower2 = {0};

//        while ((oddTower1 < 31 || oddTower2 < 31) & (evenTower1 < 32 || evenTower2 < 32)) {

//        }
//
//        }

        while (oddTower1open || oddTower2open || evenTower1open || evenTower2open) {

            int dice = new Random().nextInt(11) + 1;
            System.out.println("Random number drawn: " + dice);


            if (rollDiceFilter(dice).equals("Even")) {
                System.out.println("Even plays " + "(" + evenPlayer + " points)");
            } else {
                System.out.println("Odd plays " + "(" + oddPlayer + " points)");
            }


            System.out.println("Odd Tower 1:     (Sum: " + sumTower(oddTower1) + ") : " + Arrays.toString(oddTower1));
            System.out.println("Odd Tower 2:     (Sum: " + sumTower(oddTower2) + ") : " + Arrays.toString(oddTower2));
            System.out.println("Even Tower 1:     (Sum: " + sumTower(evenTower1) + ") : " + Arrays.toString(evenTower1));
            System.out.println("Even Tower 1:     (Sum: " + sumTower(evenTower2) + ") : " + Arrays.toString(evenTower2));


            System.out.println("To which Tower do you wish to place the number? (Type 1 or 2)");


            if (rollDiceFilter(dice).equals("Even")) {
                evenTowerSelection(evenTower1, evenTower2, dice, evenTower1open, evenTower2open);
            } else {
                oddTowerSelection(oddTower1, oddTower2, dice, oddTower1open, oddTower2open);
            }
        }
    }

    public static int sumTower(int[] tower) {
        int sum = 0;
        for (int j : tower) {
            sum += j;
        }
        return sum;
    }


    public static String rollDiceFilter(int dice) {
        if (dice % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void oddTowerSelection(int[] oddTower1, int[] oddTower2, int dice, boolean oddTower1open, boolean oddTower2open, int oddPlayer) {
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        int towerElements1 = 0;
        int towerElements2 = 0;
        int sum1 = 0;
        int sum2 = 0;

        if (choice == 1 && oddTower1open) {
            if (sumTower(oddTower1) < 31) {
                oddTower1[towerElements1] = dice;
                towerElements1 += 1;
                sum1 += dice;
            } else if (sumTower(oddTower1) == 31) {
                towerElements1 = 0;
                sum1 = 0;
                oddPlayer += 100;
            } else {
                System.out.println("The sum will exceed the maximum.");
            }
        }

        if (choice == 2 && oddTower2open) {
            if (sumTower(oddTower2) < 31) {
                oddTower2[towerElements2] = dice;
                towerElements2 += 1;
                sum1 += dice;
            } else {
                System.out.println("The sum will exceed the maximum.");
            }
        }
    }


    public static int evenTowerSelection(int[] evenTower1, int[] evenTower2, int dice, boolean evenTower1open, boolean evenTower2open) {
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        int towerElements1 = 0;
        int towerElements2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        if (choice == 1) {

            if (sumTower(evenTower1) < 32 && evenTower1open) {
                evenTower1[towerElements1] = dice;
                towerElements1 += 1;
                sum1 += dice;
            } else {
                System.out.println("You have reached the maximum number of elements in tower 1.");
                evenTower1open = false;
            }
            if (choice == 2) {

                if (sumTower(evenTower2) < 32 && evenTower2open) {
                    evenTower2[towerElements1] = dice;
                    towerElements2 += 1;
                    sum2 += dice;
                } else {
                    System.out.println("You have reached the maximum number of elements in tower 2.");
                    evenTower2open = false;
                }
            }
        }
        public static boolean oddOpenTower ( boolean oddTower1open, boolean oddTower2open){
            if (oddTower1open)

        }
        public static boolean evenOpenTower ( boolean evenTower1open, boolean evenTower2open){

        }
    }
}