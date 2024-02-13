import java.util.Scanner;

public class if8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to print Hello (between 1 and 5): ");
        int times = scanner.nextInt();
        if (times == 1) {
            System.out.println("Hello");
        } else if (times == 2) {
            System.out.println("Hello");
            System.out.println("Hello");
        } else if (times == 3) {
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
        } else if (times == 4) {
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
        } else if (times == 5) {
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}