package day13_String;

import java.util.Scanner;

public class StringsChars3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = scan.next();
        scan.close();

        int l = str.length();
        String result = "";

        if (l == 0) {
            System.out.println("string is empty");
        } else if (l > 3) {
            //System.out.println("" + str.charAt(l - 3) + str.charAt(l - 2) + str.charAt(l - 1));
            result=""+str.charAt(l - 3) + str.charAt(l - 2) + str.charAt(l - 1);//if we dont use "", result returns to asci number of chars!
        } else {
            result = str;

        }
        System.out.println(result);


    }
}
/*
Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
 */
