import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // Initialize once

        System.out.print("Choose [r]ock, [p]aper, or [s]cissors: ");
        String userChoice = scanner.nextLine().trim().toLowerCase();
        String userMove;

        if (userChoice.equals("r")) {
            userMove = ROCK;
        } else if (userChoice.equals("p")) {
            userMove = PAPER;
        } else if (userChoice.equals("s")) {
            userMove = SCISSORS;
        } else {
            System.out.println("Invalid choice! Please select 'r', 'p', or 's'.");
            return;
        }

        int computerChoice = random.nextInt(3);
        System.out.println("Computer's random choice number: " + computerChoice); // Debug output

        String computerMove;
        if (computerChoice == 0) {
            computerMove = ROCK;
        } else if (computerChoice == 1) {
            computerMove = PAPER;
        } else {
            computerMove = SCISSORS;
        }

        System.out.println("You chose: " + userMove);
        System.out.println("Computer chose: " + computerMove);

        if (userMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if ((userMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
                (userMove.equals(PAPER) && computerMove.equals(ROCK)) ||
                (userMove.equals(SCISSORS) && computerMove.equals(PAPER))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}
