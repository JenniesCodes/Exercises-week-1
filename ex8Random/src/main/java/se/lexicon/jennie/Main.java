package se.lexicon.jennie;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        int correct = r.nextInt(500) + 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the correct number:");

        int attempts = 0;

        while(true) {
            int guess = scan.nextInt();
            attempts++;
            if(guess == correct) {
                System.out.println("You win! The number was: " + correct + "\nIt only took you " + attempts + " attempts!");
                break;
            } else if (guess < correct) {
                System.out.println("Your guess was too small");
            } else if (guess > correct) {
                System.out.println("Your guess was too big");
            } else {
                System.out.println("Woops! Something went wrong..");
                break;
            }
        }
    }
}