package day00_Ders;

import java.util.Arrays;

public class ArrayCodilityPIQ {

    static int findSmallestPositiveMissingInteger(int[] array) {
        Arrays.sort(array);
        int smallest = 1;

        for (int j = 0; j < array.length; j++) {

            if (array[j] == smallest) {
                smallest++;
            }
        }
        return smallest;

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 7};
        int result = findSmallestPositiveMissingInteger(arr1);
        System.out.println(result);

    }


}
