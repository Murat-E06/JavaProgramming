package utilities;

import java.util.Arrays;

public class StringUtility {
    //NO MAIN METHOD İMPORTANT!!!

    //print each character of given string
    public static void printEachChar(String str){

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i)+" ");
        }

    }

    // reverses form of given string and returns the reversed string
    public static String reverse(String str){//"Java"
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;//"avaJ"


    }

    // checks if the given String is palindrome, returns boolean Ex: Anna, anna
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);//equalsIgnoreCase returns boolean!!! + burada bir önceki reverse metoddan da faydalandık tekrar tersine çevirmek için prog. yazmadık :)
    }

    //checks if the given string anagram, returns boolean, anagram:include same characters
    public static boolean anagram(String str1, String str2){//"acb", "bca"==>true
        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }

    //removes the duplicates from given string, returns String. Ex:"aaabbbccc"==>"abc"
    public static String removeDuplicates(String str){
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);

            if(!result.contains(""+each)){
                result+=each;
            }
        }
        return result;
    }











}
