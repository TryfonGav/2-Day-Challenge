import java.util.Random;
import java.util.Scanner;


public class towerBoardGame {
    public static void main(String[] args) {
        int min=1;
        int max=12;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int player = rand.nextInt((max - min)) + min;
        int oddPlayer = 0;
        int evenPlayer = 0;

        System.out.println(player);

    }
}