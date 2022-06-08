package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //input or scan we use
        System.out.println("Enter the radius of the circle: ");
        double r = input.nextDouble();//input or scan

        double area = 3.14 * r * r;
        double perimeter = 2 * 3.14 * r;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        input.close(); //input or scan


    }
}
