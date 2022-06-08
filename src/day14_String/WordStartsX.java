package day14_String;

import java.util.Scanner;

public class WordStartsX {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word");
        String word=scan.next();
        scan.close();

        if(word.charAt(0)=='x'){
            System.out.println(word.substring(1));
        }




    }
}
/*
Ask user to enter a word. If the work starts with x, print the
word without x.
Input:
xcode
Output:
code
 */