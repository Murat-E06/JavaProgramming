package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] numbers = {10, 9, 0, 1, 2, 3, 20, 6, 7, 8};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);//sorts the array in ascending order. first sort, next print sorted arrays!!
        System.out.println(Arrays.toString(numbers));


    }

}
