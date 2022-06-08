package day00_Ders;

import utilities.StringUtility;

public class Intro {
    public static void main(String[] args) {
        String name = "Murat";

        StringUtility.printEachChar(name);
        System.out.println("-------------------");

        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);//StringUtility i kullandıktan sonra tekrar bir String reverse e atıyoruz!!!
        System.out.println("reverse = " + reverse);
        System.out.println("-------------------");

        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);//true
        System.out.println("--------------------------");

        String[] words = {"Anna", "Mom", "Racecar", "Java"};
        int count = 0;
        for (String each : words) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("------------------------");

        String s2 = "aaaaaaaaaaaaabbbbbbbbbbbbbbcccccccccccc";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);





    }
}
