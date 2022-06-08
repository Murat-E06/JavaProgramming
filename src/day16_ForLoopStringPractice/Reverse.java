package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {//i:index number of str (starting last index to index 0)
            result += str.charAt(i);// adding each char to result
        }
        System.out.println(result);

    }
}
/*
1. Write a program that can reverse a String
***interview question***
input:
Wooden Spoon
output:
noopS nedooW
 */