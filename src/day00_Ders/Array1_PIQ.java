package day00_Ders;

import java.util.Arrays;

public class Array1_PIQ {
    public static void main(String[] args) {
        /*
         1-Find max and min numbers from the given array
            Ex:
            input: numbers = {10, 5, 4, 20, 1, 0};
            output: max = 20  min=0;
         */

        int[] numbers = {10, 5, 4, 20, 1, 0};

        int max = numbers[0];
        int min = numbers[0];

        for (int each : numbers) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("---------------------------------------");
        /*
         2-Write a program that can check if str1 & str2 are build out same characters(is Anagram?)
            String str1 = "acdb";
            String str2 ="dbca";
            MUST USE ARRAY
         */
        String str1 = "acdb";
        String str2 = "dbca";

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        System.out.println(Arrays.toString(arr1));//[a, c, d, b]

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));//[a, b, c, d]

        Boolean isAnagram = Arrays.equals(arr1, arr2);

        System.out.println("isAnagram = " + isAnagram);//isAnagram = true
        System.out.println("--------------------------------------------------------");
        /*
         3-Write a program that can reverse the given array
            Ex:
            names = {"Ahmet Özparlak", "Recai Parlak", "Doğukan Özer", "Hatice Biçer", "Cemal Kiraz"};
         */

        String[] names = {"Ahmet Özparlak", "Recai Parlak", "Doğukan Özer", "Hatice Biçer", "Cemal Kiraz"};

        for (int j = names.length-1; j >=0 ; j--) {
            String result="";

            for (int i = names[j].length()-1; i >=0 ; i--) {
                result+=names[j].charAt(i);
            }
            System.out.println(result);
        }





    }

}
