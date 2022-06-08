package day00_Ders;

import java.util.Arrays;

public class CustomMethods_PIQ {

    public static void main(String[] args) {
        String reverse = reverse("Murat");
        System.out.println("reverse = " + reverse);
        System.out.println("---------------------------------");

        boolean r1 = isPalindrome("racecar");
        System.out.println(r1);
        System.out.println("---------------------------");

        int[] arr = {2, 4, 6, 8, 0};
        int[] result = removeElement(arr, 2);
        System.out.println(Arrays.toString(result));
        System.out.println("---------------------------------");

       int[]arr2={1,1,1,1,0};
      int freq= freqOfElement(arr2,1);
        System.out.println("freq = " + freq);

    }

    /*
       1. create a method named reverse that passes one string parameter, the method can return the reversed string
				Ex:	str = "Java";
					reverse(str) ==> avaJ
     */
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    /*
     2. By using the reverse method above to create another method named isPalindrome  that passes
       a String parameter, the method returns true if the string is palindrome, otherwise returns false
                    Ex: str = "Level"
                        isPalindrome(str) ===> true
     */
    public static boolean isPalindrome(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }
    /*
      3. create a method named removeElement that passes one integer array and one integer,
    the method removes the integer index from the integer array and returns the new array
			Ex: array = {10, 20, 30, 40, 50, 60}
				index = 2
				removeElement(array, index) ==== {10, 20, 40, 50, 60}
     */
    public static int[] removeElement(int[] arr, int index) {
        int[] result = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            } else {
                result[j++] = arr[i];
            }
        }
        return result;
    }
    /*
    4. create method that accepts one integer array and one integer number and returns the frequency of the number
                    Ex:  int[] array ={1,1,1,1,1,2,2};
                        frequency(array, 1) ==> 5
     */
    public static int freqOfElement(int[] arr, int element) {
        int freq = 0;

        for (int each : arr) {
            if (each == element) {
                freq++;
            }
        }
        return freq;
    } }
