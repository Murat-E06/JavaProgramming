package day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648; //  min number in the java integer area

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num > max) {
                max = num;
            }
        }
        System.out.println("max = " + max);
        scan.close();


    }
}
/*
write a prog to ask user enter a number 5 times
returns the prog max
 */