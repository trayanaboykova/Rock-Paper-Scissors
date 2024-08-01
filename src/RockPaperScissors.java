import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Choose [r]ock, [p]aper, or [s]cissors: ");
        String userInput = scanner.nextLine().trim().toLowerCase();
        String userMove;

        if (userInput.equals("r") || userInput.equals("rock")) {
            userMove = ROCK;
        } else if (userInput.equals("p") || userInput.equals("paper")) {
            userMove = PAPER;
        } else if (userInput.equals("s") || userInput.equals("scissors")) {
            userMove = SCISSORS;
        } else {
            System.out.println("Invalid choice! Please select 'r', 'p', or 's'.");
            scanner.close();
            return;
        }

        int computerChoice = random.nextInt(3);
        String computerMove;

        switch (computerChoice) {
            case 0:
                computerMove = ROCK;
                break;
            case 1:
                computerMove = PAPER;
                break;
            case 2:
                computerMove = SCISSORS;
                break;
            default:
                computerMove = ROCK;
        }

        System.out.println("The computer chose " + computerMove + ".");

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

