package se.lexicon.jennis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a random number:");

        int num1 = scan.nextInt();

        // Alt 2: double a = (double) num1;

        System.out.println("And now a second number:");

        int num2 = scan.nextInt();

        // Alt 2: double b = (double) num2;

        // Alt 3: double c = (double) num1/num2;

        System.out.println("Thanx. Here are some calculations based on your numbers:");

        System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
        System.out.println(num1 + "*" + num2 + " = " + (num1*num2));
        System.out.println(num1 + "/" + num2 + " = " + ((double) num1/num2)); // Alt 2: (a/b)  Alt 3: (c)
        System.out.println(num1 + "-" + num2 + " = " + (num1-num2));
    }
}