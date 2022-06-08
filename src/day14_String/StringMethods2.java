package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        System.out.println("--------------------------");

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);
        System.out.println("------------------------------");

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", "");
        System.out.println("sentence2 = " + sentence2);

        sentence2 = sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java");//second C# will change.
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("a", "e");// only single char can be able to change all a char changes.
        System.out.println("s3 = " + s3);
        System.out.println("------------------------------------");

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println(result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "e");//only firs a changes
        System.out.println(result3);


        String result4 = "Java";
        result4 = result4.replaceFirst("va", "ve");//in order to change second a
        System.out.println(result4);

        String s4="Java java";
        System.out.println(s4.toLowerCase().replace('a','e'));



    }
}
