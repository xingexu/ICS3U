import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            sum += scanner.nextInt();
        }

        System.out.println("Sum: " + sum);
    }
}