package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ItemNameAndPrices {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[]names=new String[5];
        int[]prices=new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an item name and prices");
            names[i]=scan.next();
            prices[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(prices));

        scan.close();

    }
}
/*
 Items
1. Create an array named items with the
length of 5
2. Create an array named prices with the
length of 5
3. Ask user to enter item name and price 5
times and store them into the items and prices arrays
4. calculate the total price of the arrays
5. display each item name and price in
separate lines
ItemName -- Price
 */