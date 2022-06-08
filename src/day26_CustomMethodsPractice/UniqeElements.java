package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqeElements {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 7};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));
        System.out.println("----------------------");

        double[] array2 = {1.5, 2.2, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};
        double[] unique2 = uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));


    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};//It is temporary

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};//It is temporary

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};//It is temporary

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};//It is temporary

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    
    
    


}
