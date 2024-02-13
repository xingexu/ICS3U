import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        double userMark = scanner.nextDouble();
        if (userMark >= 50) {
            System.out.println("You Passed");
        } else {
            System.out.println("You Failed");
        }

        scanner.close();
    }
}