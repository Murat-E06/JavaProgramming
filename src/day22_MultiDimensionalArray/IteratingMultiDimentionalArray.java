package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimentionalArray {
    public static void main(String[] args) {
       //index of element:      0  1  2    0  1  2  3    0  1  2   3    4
              int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
         //  index of arrays:      0           1               2

        for (int i = 0; i < arr2D.length; i++) {//i:index number of single dimen.arrays
            //System.out.println(Arrays.toString(arr2D[i]));

            for (int j = 0; j < arr2D[i].length; j++) {//j:index number of elements. arr2D.fori=shortcut
                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();//her arrayin arasına satır ilave eder.kullanmazsak hepsini aynı satıra yazar.

        }




    }
}
