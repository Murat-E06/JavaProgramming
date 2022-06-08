package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5,6};//7
        numbers=addElement(numbers,7);

        char[]chars={'A','B','C','D'};//'E
        chars=addElement(chars,'E');

        String[]names={"Ali","Veli","Oya"};//"Can"
        names=addElement(names,"Can");

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));


    }
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;  //arrayın son each ini de ilave eder,
        }
        result[i] = element;// i'yi artırır (post increment) ona da ilave elementi atar bitirir :)
        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;  //arrayın son each ini de ilave eder,
        }
        result[i] = element;// i'yi artırır (post increment) ona da ilave elementi atar bitirir :)
        return result;
    }

    //create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element) {//Ctrl+R==>replace double to String than replace all
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;  //arrayın son each ini de ilave eder,
        }
        result[i] = element;// i'yi artırır (post increment) ona da ilave elementi atar bitirir :)
        return result;
    }

    //create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element) {//Ctrl+R==>replace double to char than replace all
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;  //arrayın son each ini de ilave eder,
        }
        result[i] = element;// i'yi artırır (post increment) ona da ilave elementi atar bitirir :)
        return result;
    }




}
