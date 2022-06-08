package day13_String;

import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String sent = scan.nextLine();
        scan.close();

        char first = sent.charAt(0),
                last = sent.charAt(sent.length() - 1);

        System.out.println(first + "&" +last);//if we dont use "", result returns to asci number of chars!

    }
}
/*
write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
 */
