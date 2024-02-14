import java.util.Scanner;

public class SelRv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 30: ");
        int number = scanner.nextInt();

        if (number == 0 || number == 10) {
            System.out.println("Nice try");
        } else if (number >= 20 && number <= 23) {
            System.out.println("Great!");
        } else {
            System.out.println("Invalid value");
        }
    }
}