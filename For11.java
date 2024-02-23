import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num < low) {
                low = num;
            }
        }

        System.out.println("Lowest mark: " + low);
    }
}