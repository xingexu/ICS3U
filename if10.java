import java.util.Scanner;

public class if9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();
        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Comfortable");
        } else if (temperature >= 10 && temperature <= 19) {
            System.out.println("Cool");
        } else {
            System.out.println("Cold");
        }

        scanner.close();
    }
}