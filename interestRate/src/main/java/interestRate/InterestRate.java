package interestRate;

public class InterestRate {
    public static void main(String[] args) {
        double balance = 1000;
        System.out.println("Initial balance: " + balance);
        for (int i = 0; i < 3; i++) {
            System.out.printf("Balance of %d years is: %.2f\n", i + 1, balance * Math.pow(1.05, i + 1));
        }
    }
}
