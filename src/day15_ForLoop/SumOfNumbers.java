package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        //1+2+3+....+100=?
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);//5050
        System.out.println("---------------------------");

        //ask to user enter 5 numbers in order than write to calculate total

        int total = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            total += scan.nextInt();
        }
        scan.close();

        System.out.println("total = " + total);


    }
}
