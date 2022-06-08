package day15_ForLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        /*
        write a prog to ask user enter a number 5 times
returns the prog max
         */
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;//max int number in java

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");//if we want to repeat our asks we must enter the stat. in the loop!
            int num = scan.nextInt();
            if (num < min) {
                min = num;
            }

        }
        System.out.println("min = " + min);
        scan.close();

    }
}
