package day00_Ders;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String str = "I Love Java";

        String[] sentence = str.split(" ");
        System.out.println(Arrays.toString(sentence));

        String reversedWord="";
        for (int i = sentence[2].length()-1; i >=0 ; i--) {
            reversedWord+=sentence[2].charAt(i);
        }
        System.out.println(reversedWord);

        sentence[2]=reversedWord;

        System.out.println(Arrays.toString(sentence));

        for (String each : sentence) {
            System.out.print(each+" ");

        }


    }
}


/*
 Write a program that can reverse the second word of the sentence
sentence = "I Love Java";
output:
I evoL Java
 */
