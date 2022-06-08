package day12_Scanner;


import java.util.Scanner;

public class NextLineMethodPractise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your gpa");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your School Name");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);


        input.close();


    }
}
/*
1. ask to user to enter age (next int)
2. ask the user to enter full name (next line) this time
 */