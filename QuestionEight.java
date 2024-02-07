public class QuestionEight {
    public static void main(String[] args) {
        double purchasePrice = 12.99; 
        double hstRate = 0.13;
        double hst = purchasePrice * hstRate;
        System.out.printf("The HST on a purchase of $%.2f is: $%.2f%n", purchasePrice, hst);
    }
}