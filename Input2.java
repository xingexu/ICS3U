import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        double radius = scanner.nextDouble();
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference is " + circumference + " units");
    }
}