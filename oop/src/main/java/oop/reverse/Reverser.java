package oop.reverse;

import java.util.Scanner;

public interface Reverser {
    public static void reverser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the reverser interface");
        System.out.println("Enter the string to be reversed");
        String s = scan.nextLine();
        System.out.println("Do you want o use fast (1) or slow (2) reversing?");
        int choice = scan.nextInt();
        if(choice == 2){
            System.out.println(ReverserSlow.reverserSlow(s));
        }
        else if(choice == 1){
            System.out.println(ReverserFast.reverseFast(s));
        }
        else{
            System.out.println("Wrong argument, string was not reversed");
        }
    }
}
