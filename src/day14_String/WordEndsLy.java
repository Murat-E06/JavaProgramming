package day14_String;

import java.util.Scanner;

public class WordEndsLy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();

        String last2 = word.substring(word.length() - 2);
        if (last2.equals("ly")) {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }


    }
}
/*
ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
 */