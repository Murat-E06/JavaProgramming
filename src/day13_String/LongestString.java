package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first word");
        String str1 = scan.next();
        System.out.println("Please enter your second word");
        String str2 = scan.next();
        scan.close();

        int l1 = str1.length();
        int l2 = str2.length();

        if (l1 > l2) {
            System.out.println("longest one is: " + str1);
        } else if (l2 > l1) {
            System.out.println("longest one is: " + str2);
        } else {
            System.out.println("Both are the same length");

        }

    }
}
/*
write a program that asks user to enter two strings, and print out the
longest string
 */
