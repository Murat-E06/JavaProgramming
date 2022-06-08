package day22_MultiDimensionalArray;

public class ForEachLoop {
    public static void main(String[] args) {
        //index of element:      0  1  2    0  1  2  3    0  1  2   3    4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7,8}, {9, 10, 11, 12,13}};
        //  index of arrays:      0           1               2

        for (int[] each1DArray : arr2D) {//shortcut:arr2D.for=> each1DArray ismini biz verdik variable name
            for (int eachElement : each1DArray) {//shortcut:each1DArray.for
                System.out.print(eachElement+" ");//sadece baştan sona yazdırmak istersek kullanabiliriz.!!

            }
            System.out.println();

        }





    }
}
