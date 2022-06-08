package day15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String str = "";
        boolean r = str.isEmpty();//true

        boolean r1 = str.isBlank();//true arası açık boş olsa da true

        System.out.println(r);
        System.out.println(r1);
        System.out.println("--------------------------");
        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));//false, equals and contain methods return boolean. in equals all of them will same
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("yEs".equalsIgnoreCase("Yes"));//true
        System.out.println("-----------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");//false
        boolean hasJava = sentence.contains("Java");//true
        boolean hasJava2 = sentence.contains("java");//false
        boolean hasJava3 = sentence.toLowerCase().contains("java");//true

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println("-------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.contains("Java"));//true
        System.out.println("-----------------------------");

        String a="Wooden Spoon";
        boolean x =a.startsWith("Woo");
        boolean y =a.endsWith("n");

        System.out.println(x);
        System.out.println(y);


    }

}
