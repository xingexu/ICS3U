import java.util.Scanner;

public class SelRv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first mark: ");
        double mark1 = scanner.nextDouble();

        if (mark1 < 0) {
            System.out.println("The first input cannot be negative");
        } else if (mark1 > 100) {
            System.out.println("The first input cannot be greater than 100");
        } else {
            System.out.print("Enter the second mark: ");
            double mark2 = scanner.nextDouble();

            if (mark2 < 0) {
                System.out.println("The second input cannot be negative");
            } else if (mark2 > 100) {
                System.out.println("The second input cannot be greater than 100");
            } else {
                System.out.println("The higher mark is: " + Math.max(mark1, mark2));
            }
        }
    }
}
