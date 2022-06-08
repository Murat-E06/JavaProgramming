package day00_Ders;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int sum=0;
        int number=0;

        while (true){
            System.out.println("Enter a number");
             number=scan.nextInt();

            if(number<0){
                break;
            }
            sum+=number;
        }
        System.out.println(sum);



    }
}
/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
hint: you need an infinite loop
 */