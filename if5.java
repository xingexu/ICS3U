import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the password: ");
        String password = scanner.next();
        if (password.equals("happy")) {
            System.out.println("You are logged in");
        } else {
            System.out.println("Incorrect password");
        }

        scanner.close();
    }
}
