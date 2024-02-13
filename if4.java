import java.util.Scanner;

public class if4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a secret number: "); //user knows the secret number???
        int secretNumber = scanner.nextInt();
        System.out.print("Guess the secret number: ");
        int guess = scanner.nextInt();
        if (guess == secretNumber) {
            System.out.println("You got it");
        } else {
            System.out.println("Guess again");
        }

        scanner.close();
    }
}
