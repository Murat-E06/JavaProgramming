package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";
        //    index=   01234
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);//explanation:String index out of range: 9
         */
        System.out.println("-------------------------");
        String s1 = "EU8 is the best group";
        int totalChar = s1.length();
        System.out.println("totalChar = " + totalChar);

        char lastChar = s1.charAt(s1.length() - 1);//formula of the last index char!
        System.out.println("lastChar = " + lastChar);
        System.out.println("----------------------------------------");

        String word1 = "wooden spoon";
        word1 = word1.toUpperCase();//we need to assign same name to convert upper case otherwise it can't change.
        System.out.println(word1);

        String sentences = "Today is a great day to learn java prog. lang.";
        sentences = sentences.toUpperCase();
        System.out.println(sentences);


    }
}
