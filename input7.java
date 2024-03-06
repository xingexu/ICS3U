import java.util.Scanner;

public class input7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("The area is " + area + " square units");
        System.out.println("The perimeter is " + perimeter + " units");
    }
}