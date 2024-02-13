import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess the number: ");
        int number = scanner.nextInt();
        if (number == 66) {
            System.out.println("You got it");
        } else {
            System.out.println("Guess again");
        }

        scanner.close();
    }
}