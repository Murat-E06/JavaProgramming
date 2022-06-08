package day00_Ders;

import java.util.Scanner;

public class ItemsNamesAndPrices {
    public static void main(String[] args) {
        String[] items = new String[5];
        double[] prices = new double[5];

        Scanner scan = new Scanner(System.in);

        double total=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter item name");
            items[i] = scan.next();
            System.out.println("Enter price");
            prices[i] = scan.nextDouble();
            total+=prices[i];
        }
        System.out.println("total = " + total);
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(items[i] + "---" + prices[i]);
        }

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
