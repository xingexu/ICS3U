import java.util.Scanner;

public class if6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first mark: ");
        double mark1 = scanner.nextDouble();
        System.out.print("Enter the second mark: ");
        double mark2 = scanner.nextDouble();
        if (mark1 > mark2) {
            System.out.println("Higher mark: " + mark1);
        } else {
            System.out.println("Higher mark: " + mark2);
        }

        scanner.close();
    }
}