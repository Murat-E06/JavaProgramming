package day22_MultiDimensionalArray;

public class IteratingMuitiDimensionalArray2 {
    public static void main(String[] args) {

        //index of element:      0  1  2    0  1  2  3    0  1  2   3    4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7,8}, {9, 10, 11, 12,13}};
        //  index of arrays:      0           1               2

        for (int i = arr2D.length - 1; i >= 0; i--) {//i:index number 1D arrays starting last index. shortcut:arr2D.forr  (reverse)
            for (int j = 0; j < arr2D[i].length; j++) {//j:index number of elements starting 0
                System.out.print(arr2D[i][j]+" ");//println yazsaydık aşağıya doğru yazacaktı yanyana her arayi yazıp mteakip arayı da aşağıdaki println vasıtasıyla bir alt satıra yazar!
            }
            System.out.println();//her arrayı farklı satırlara yazsın diye
        }
        System.out.println("------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {//arr2D[i]  de [i] yi ilave etmeyi UNUTMA!!
                System.out.print(arr2D[i][j]+" ");//print!!

            }
            System.out.println();

        }
        System.out.println("-----------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();

        }



    }
}
/*
output:task1
9 10 11 12 13
4 5 6 7 8
1 2 3

task2:
321
87654
131211109
task3:

131211109
87654
321
 */