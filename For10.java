import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num > high) {
                high = num;
            }
        }

        System.out.println("Highest mark: " + high);
    }
}