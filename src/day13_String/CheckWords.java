package day13_String;


import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String first = scan.next();

        System.out.println("Enter second word");
        String second = scan.next();

        System.out.println("Enter third word");
        String third = scan.next();
        scan.close();

        int l1 = first.length(),
                l2 = second.length(),
                l3 = third.length();

        if (l1 == l2 && l2 == l3) {
            System.out.println("All words are same length");
        } else if (l1 == l2) {
            System.out.println("Not Same nor Different lengths");
        } else if (l1 == l3) {
            System.out.println("Not Same nor Different lengths");
        } else if (l2 == l3) {
            System.out.println("Not Same nor Different lengths");
        } else {
            System.out.println("All different length");
        }

    }
}
/*
Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"
 */