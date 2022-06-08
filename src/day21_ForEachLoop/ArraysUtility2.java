package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "Aaron", "Daniel"};

        String[] earlyBirds = Arrays.copyOf(students, 5);
        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        numbers = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(numbers));
        System.out.println("----------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6);//2 include but 6 exclude like substring method!!
        System.out.println(Arrays.toString(ch2));
        System.out.println("--------------------------------------");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};//we want to copy 40~80 include
        int[] result = Arrays.copyOfRange(scores, 3, 8);
        System.out.println(Arrays.toString(result));

        int[]result2=Arrays.copyOfRange(scores, 6, scores.length);
        System.out.println(Arrays.toString(result2));


    }
}
