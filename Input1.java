
import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();
        int result = number * 5;
        System.out.println("Result: " + result);
    }
}