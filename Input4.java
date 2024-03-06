import java.util.Scanner;

public class input4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("The sum is: " + sum);
    }
}