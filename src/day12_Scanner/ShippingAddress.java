package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your building name");
        String buildingName = scan.next();

        scan.nextLine();

        System.out.println("Enter your street name");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String stateName = scan.next();

        System.out.println("Enter your zip code");
        String zipCode = scan.next();

        scan.nextLine();

        System.out.println("Enter your country name");
        String coutryName = scan.nextLine();

        System.out.println(fullName);
        System.out.println(buildingName + " " + stateName);
        System.out.println(cityName + ", " + stateName + " " + zipCode + ", " + coutryName);

        scan.close();


    }
}
/*
1.Enter your full name (nextLine() )
2. ....building name  (next() )
3. .....street name (nextLine() )
4. .....city name (nextLine() )
5.  .....your state (next() )
6.   ....zip code (next() )
7.  .....country name (nextLine() )

display the shipping address like below
john Smith
7925 Jones Branch Dr
McLean, VA 22102, USA

 */