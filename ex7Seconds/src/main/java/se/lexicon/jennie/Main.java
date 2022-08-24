package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        int s = 86399;
        int hours = s/60/60;
        int minutes = s/60%60;
        int seconds = s%60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}