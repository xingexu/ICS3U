import java.util.Scanner;

public class SelRv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of legs: ");
        int legs = scanner.nextInt();

        if (legs == 2) {
            System.out.println("human");
        } else if (legs == 4) {
            System.out.println("beast");
        } else if (legs == 6) {
            System.out.println("insect");
        } else {
            System.out.println("???");
        }
    }
}
