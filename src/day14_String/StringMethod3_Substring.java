package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        String str1 = "Cydeo School";
        //             01234
        str1 = str1.substring(0, 5);//it starts to 0 till to 5-1=4. char ends
        System.out.println(str1);
        System.out.println("---------------------");

        String word2 = "Java Programming Language";
        String s1 = word2.substring(0, word2.indexOf(" "));// Java
        System.out.println(s1);

        //String s2 = word2.substring(word2.indexOf("P"), word2.indexOf(" L"));
        String s2 = word2.substring(word2.indexOf(" ") + 1, word2.lastIndexOf(" "));//Muhtar's solution, Programming
        System.out.println(s2);

        //String s3 = word2.substring(word2.indexOf("L"));
        String s3 = word2.substring(word2.lastIndexOf(" ") + 1);//Muhtar's solution. It used by all 3 werbs sentenceses, Language
        System.out.println(s3);


    }
}
