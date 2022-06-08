package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbcccd";
        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i);//repesent each character of str="aabbcccd"
            //boş "" ilave etmeseydik hata verecek ti sol taraf string sağ taraf char

            if (!result.contains(ch)) {//if the character is not contained in the result
                result += ch;//the char. will be added to result
            }
        }

        System.out.println(result);
    }
}
/**
 * İnterview question**
 * 2. Write a program that can remove the duplicated characters from a
 * String
 * Ex:
 * input:
 * AABBCCBC
 * Output:
 * ABC
 * Hint: You can add each characters of the
 * string into another String
 * Condition: the character is not
 * contained in the other String yet before you are adding
 */