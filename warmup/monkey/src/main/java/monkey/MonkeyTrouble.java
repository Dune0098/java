package monkey;

import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("The a monkey is smiling?");
        boolean aSmile = input.nextBoolean();
        System.out.println("The a monkey is smiling?");
        boolean bSmile = input.nextBoolean();
        if(aSmile && bSmile || !aSmile && !bSmile){
            System.out.println("We are in trouble");
        }
        else {
            System.out.println("We are not in trouble");
        }
    }
}

