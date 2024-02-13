import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10: ");
        int number = myScanner.nextInt();
        if (number >= 5){
            System.out.println("You Won!");
        }
    }
}