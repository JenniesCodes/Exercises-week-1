package se.lexicon.jennie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Username:");

        String name = scan.nextLine();

        System.out.println("Your username is: \n" + name);
    }
}