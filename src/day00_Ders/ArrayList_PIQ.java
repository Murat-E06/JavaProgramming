package day00_Ders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_PIQ {
    public static void main(String[] args) {
/*
 1- Write a program that can only writes unique chars from the given string
       String str = "aaabbbcdddfeee";
       MUST USE ARRAYLIST
 */
        String str = "aaabbbcdddfeee";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));//[a, a, a, b, b, b, c, d, d, d, f, e, e, e]

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));//[a, a, a, b, b, b, c, d, d, d, f, e, e, e]

        String unique = "";
        for (String each : list) {
            int freq = Collections.frequency(list, each);
            if (freq == 1) {
                unique += each;
            }
        }
        System.out.println("unique = " + unique);
        System.out.println("-------------------------------------");

        //  2-Write a program that can find the max and min number, sum of the numbers from the given ArrayList

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);

        // int max=Collections.max(list2);
        //  System.out.println("max = " + max);

        int max = list2.get(0);
        int min = list2.get(0);
        int sum = 0;

        for (Integer each : list2) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
            sum += each;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);

        int avarage = sum / list2.size();
        System.out.println("avarage = " + avarage);
        System.out.println("-----------------------------------------------------");

        // 3-Write a program that can remove the duplicates from the given ArrayList
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(10);
        list3.add(10);
        list3.add(20);
        list3.add(20);
        list3.add(20);
        list3.add(30);
        list3.add(30);
        list3.add(30);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list3) {
            if (!result.contains(each)) {
                result.add(each);
            }
        }
        System.out.println(result);
        System.out.println("mrb");

    }
}
