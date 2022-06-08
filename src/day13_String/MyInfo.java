package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();//only we can use it again we assign "int age="

        System.out.println("Enter your gender");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your phone number");
        long phone = scan.nextLong();

        System.out.println("Enter your zip kod");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your School name");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String state = scan.next();

        scan.nextLine();

        System.out.println("Enter your building number");
        int buildingNum = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String street = scan.nextLine();

        scan.close();

        System.out.println("FullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phone = " + phone);
        System.out.println("address:\n\t" + buildingNum + " " + street + "\n\t" + cityName + ", " + state + " " + zipCode);
        System.out.println("schoolName = " + schoolName);





        /*
        1. Enter your age(int-->nextInt() )
        2. Enter your gender (string-one word only-->next() ) nextLine()
        3. Enter your full name (string multiple words--->nextLine() )
        4. Enter your phone number (long-->nextLong() )
        5. Enter your zip kod (int-->nextInt() )  nextLine()
        6. Enter your School name(String-can be multiple words-->nextLine() )
        7. Enter your city name (String-can be multiple words-->nextLine() )
        8. Enter your state name (String-one word only--->next() )
        9. Enter your building name (int--->nextInt() ) nextLine()
        10. Enter your Street name (nextLine() )
        Display inputs that user entered in fallowing order in separate lines:
        1. full name
        2. age
        3. gender
        4. phone number
        5. address:
            buildingNumber Street
            City, State ZipCode
         6. school name


         */


    }
}
