import java.util.Scanner;

public class SelRv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to print 'Hello': ");
        int times = scanner.nextInt();

        if (times >= 1 && times <= 5) {
            for (int i = 0; i < times; i++) {
                System.out.println("Hello");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
