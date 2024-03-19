import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BayviewmonGoXuXinge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int bokeballs = 5, greatballs = 5, ultraballs = 5; // Start with 5 of each type of ball
        int totalScore = 0;
        int bayviewmonIndex;
        int ballChoice = 0; // Initialized to avoid 'variable might not have been initialized' error
        String playerName;
        char encounter;
        char playAgain;

        System.out.println("Please enter your name!");
        playerName = input.nextLine();
        System.out.println("Hello " + playerName + ", Welcome to Bayviewmon GO!");

        do {
            bokeballs = 5;
            greatballs = 5;
            ultraballs = 5;
            totalScore = 0;

            for (int round = 0; round < 15; round++) {
                bayviewmonIndex = rand.nextInt(5); // Generates a random number between 0 and 4
                System.out.println("Here is a Bayviewmon. Would you like to encounter it? (y/n)");
                encounter = input.next().charAt(0);

                if (encounter != 'y' && encounter != 'Y') {
                    System.out.println("You decided not to encounter the Bayviewmon.");
                    continue;
                }

                // Assigning names and points without switch-case
                String[] bayviewmonNames = {"Baykachu", "Bulbabay", "Charmanview", "Squirtew", "Eevay"};
                int[] bayviewmonPoints = {2, 2, 3, 4, 5};
                String bayviewmonName = bayviewmonNames[bayviewmonIndex];
                int points = bayviewmonPoints[bayviewmonIndex];

                System.out.println("You encountered a " + bayviewmonName + " worth " + points + " points!");

                boolean validInput = false;
                while (!validInput) {
                    System.out.println("Choose a ball to throw: 1. Bokeball 2. Greatball 3. Ultraball (Remaining: " +  bokeballs + " " + greatballs + " " + ultraballs + ")");
                    try {
                        ballChoice = input.nextInt();
                        if (ballChoice == 1 && bokeballs > 0) {
                            bokeballs--;
                            validInput = true;
                        } else if (ballChoice == 2 && greatballs > 0) {
                            greatballs--;
                            validInput = true;
                        } else if (ballChoice == 3 && ultraballs > 0) {
                            ultraballs--;
                            validInput = true;
                        } else if (ballChoice < 1 || ballChoice > 3) {
                            System.out.println("Invalid choice. Please enter 1, 2, or 3:");
                        } else {
                            System.out.println("You're out of that type of ball!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number 1, 2, or 3.");
                        input.next(); // Clear the invalid input
                    }
                }

                boolean isCaught = rand.nextInt(100) < (50 + ballChoice * 10);
                if (isCaught) {
                    System.out.println("Caught it!");
                    totalScore += points;
                } else {
                    System.out.println("It fled!");
                }

                System.out.println("Your current score is: " + totalScore);
            }

            System.out.println("Your final score is: " + totalScore);
            if (totalScore > 20) {
                System.out.println("You are an excellent Bayviewmon catcher!");
            } else if (totalScore >= 15) {
                System.out.println("You are a decent Bayviewmon catcher.");
            } else {
                System.out.println("You need more practice at catching Bayviewmons.");
            }

            System.out.println("Do you want to play again? (Y/N)");
            playAgain = input.next().charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y');

        input.close();
        System.out.println("Thank you for playing Bayviewmon GO!");
    }
}
