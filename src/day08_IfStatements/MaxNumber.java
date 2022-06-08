package day08_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
        /*
        Write a program that can print the maximum number between two
numbers, if both are equal then print Equal
Ex:
n1= 100, n2 = 200;
output:
200 is maximum number
         */
        int num1 = 100;
        int num2 = 300;
        boolean num1max = num1 > num2;
        boolean num2max = num2 > num1;
        boolean equal = num1 == num2;
        if (num1max) {
            System.out.println(num1 + " is maximum number");
        }
        if (num2max) {
            System.out.println(num2 + " is maximum number");
        }
        if (equal) {
            System.out.println("Equal");
        }
    }
}
