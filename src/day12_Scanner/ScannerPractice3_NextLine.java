package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();//Wooden SpoonEnter

        System.out.println("Enter your programming language: ");
        String programming = input.nextLine();//Java Programming LanguageEnter

        System.out.println("Enter Your age: ");
        int age = input.nextInt();//24Enter

        input.nextLine();/*
        Enter bu satırı ilave etmezsek school name girdirmeden print stat.lara atlıyor!
        capture the Enter key that user pressed for nextInt()
        we are cleaning compailer memory
        */

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();


    }
}
