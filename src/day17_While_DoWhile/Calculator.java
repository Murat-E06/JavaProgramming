package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int n1 = scan.nextInt();

        System.out.println("Enter your second number");
        int n2 = scan.nextInt();

        System.out.println("Enter a math operator");
        char ch = scan.next().charAt(0);
        while (!(ch == '+' || ch == '-')) {
            System.err.println("Invalid op, please re_enter");
            ch = scan.next().charAt(0);
        }
        System.out.println((ch == '+') ? n1 + n2 : n1 - n2);


    }

}
