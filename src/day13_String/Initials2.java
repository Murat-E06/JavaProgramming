package day13_String;

import java.util.Scanner;

public class Initials2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String first = scan.next();

        System.out.println("Enter your first word");
        String second = scan.next();

        scan.close();

        char f = first.toUpperCase().charAt(0);
        char s = second.toUpperCase().charAt(0);

        System.out.println(f + "." + s);


    }
}
/*
write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output
 */