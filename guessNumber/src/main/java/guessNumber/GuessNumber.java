package guessNumber;

import java.util.random.RandomGenerator;
import java.util.Scanner;

public class GuessNumber {
    public void game() {
        RandomGenerator random = RandomGenerator.getDefault();
        Scanner input = new Scanner(System.in);

        while(true){
            int x = random.nextInt(4);
            System.out.println("Guess a number between 0 to 3 to end program:");
            int in = input.nextInt();
            if(in != x) {
                System.out.println("Wrong answer, try agian");
            }
            else {
                if(x != 0) {
                    System.out.println("You guessed correctrly let's continue the game");
                }
                else{
                    System.out.println("You gussed correctly zero! Games end");
                    break;
                }
            }
        }
    }
}
