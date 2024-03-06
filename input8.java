import java.util.Scanner;

public class input8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the interest rate (%): ");
        double rate = scanner.nextDouble() / 100;
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double interest = principal * rate * years;
        double totalAmount = principal + interest;

        System.out.println("Interest earned: " + interest);
        System.out.println("Total amount after " + years + " years: " + totalAmount);
    }
}