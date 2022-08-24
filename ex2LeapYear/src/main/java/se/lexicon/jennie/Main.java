package se.lexicon.jennie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a year:");
        int year = scan.nextInt();

        /* If the year is evenly divisible by 4, it is a leap year, unless it's
        a century year. Then it has to be evenly divisible by 400 as well
        to be a leap year
         */

        if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}