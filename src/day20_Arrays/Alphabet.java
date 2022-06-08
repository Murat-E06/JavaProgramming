package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] alphabet = new char[26];//Z~A
       /* alphabet[0]='Z';
        System.out.println(Arrays.toString(alphabet));//whole array
        System.out.println(alphabet[0]);//only printing the element of array

        */
        /*

         /*


        char ch='Z';
        for (int i = 0; i <alphabet.length ; i++,ch--) {
            alphabet[i]=ch;
             }
         */

        for (char i = 0, j = 'Z'; i < alphabet.length; i++, j--) {//2. sol
            alphabet[i] = j;
        }
        System.out.println(Arrays.toString(alphabet));


    }
}
