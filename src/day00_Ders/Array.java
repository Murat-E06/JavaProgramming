package day00_Ders;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr3));

        for (int i = arr1.length, j = 0; i < arr3.length; i++, j++) {
            arr3[i] = arr2[j];
        }
        System.out.println(Arrays.toString(arr3));

        int[] result = {};

        for (int each : arr3) {
            if (ArraysUtility.frequencyOfElement(arr3, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
