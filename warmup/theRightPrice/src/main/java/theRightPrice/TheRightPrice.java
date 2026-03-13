package theRightPrice;

import java.util.random.RandomGenerator;
import java.util.Scanner;

public class TheRightPrice {
    public static void main(String[] args) {
        RandomGenerator rand = RandomGenerator.getDefault();
        int casual = rand.nextInt(100);
        Scanner input = new Scanner(System.in);

        System.out.println("Guess the right price of the object");
        System.out.println("Enter the first guess");
        int answer1 = input.nextInt();
        System.out.println("Enter the second guess");
        int answer2 = input.nextInt();
        if(Math.abs(casual - answer2) > Math.abs(casual - answer1)){
            System.out.println("The winner is player 1");
        }
        else{
            System.out.println("The winner is player 2");
        }
    }
}
