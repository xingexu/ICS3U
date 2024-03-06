import java.util.Scanner;

public class input5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();
        int doubledNumber = number * 2;
        System.out.println("Doubled number: " + doubledNumber);
    }
}