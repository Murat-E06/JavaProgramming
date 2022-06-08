package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[] group1 = {"John", "James", "Jil"};
        String[] group2 = {"Ahmet", "Ali", "Mehmet"};
        String[] group3 = {"Can", "Cem", "Isık"};

        String[][] groups = new String[3][];
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;
        //System.out.println(Arrays.toString(groups));// only for one dimensional Array
        System.out.println(Arrays.deepToString(groups));//deepToString used for multidimensional array!
        System.out.println("---------------------------");

// index of element:      0  1  2    0  1  2  3    0  1  2   3    4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
   //  index of arrays:      0           1               2

        System.out.println(Arrays.deepToString(arr2D));//hepsi

        System.out.println(Arrays.toString(arr2D[1]));//{4,5,6,7}

        System.out.println(arr2D[2][3]);//11


    }
}
