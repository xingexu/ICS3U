import java.util.Scanner;

public class if10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        double userMark = scanner.nextDouble();
        if (userMark >= 75 && userMark <= 100) {
            System.out.println("Great");
        } else if (userMark >= 50 && userMark <= 74) {
            System.out.println("Pass");
        } else if (userMark >= 0 && userMark <= 49) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}