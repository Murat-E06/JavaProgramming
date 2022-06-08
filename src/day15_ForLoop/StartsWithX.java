package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();//sadece bir kez scan kullanacaksak bu şekilde de yazılabiliyor!
        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a");
        }
        System.out.println(word);

    }
}
/*
İnput:xcodex
output:acodex
 */