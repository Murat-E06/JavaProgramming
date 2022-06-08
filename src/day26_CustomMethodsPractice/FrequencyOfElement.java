package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 11, 4, 4, 44, 1111};
        int n = frequencyOfElement(arr, 1);
        System.out.println(n);


    }

    // returns the freq. of the given element from the given array  [1,1,1,2,3,4,5] /  1
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the freq. of the given element from the given array  [1,1,1,2,3,4,5] /  1
    public static double frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the freq. of the given element from the given array  [1,1,1,2,3,4,5] /  1
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the freq. of the given element from the given array  [1,1,1,2,3,4,5] /  1
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }


}
