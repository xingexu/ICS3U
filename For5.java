import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.print("How many times to print the word: ");
        int times = scanner.nextInt();

        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
}
